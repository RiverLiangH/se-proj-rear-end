package com.evan.seprojrearend.service;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.DeleteObjectsRequest;
import com.aliyun.oss.model.PutObjectResult;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.*;

@Slf4j
@Component
@AllArgsConstructor
public class OssTemplate {
    // 我自己抽的统一文件前缀，communication-resource
    private final String prefix = "oss.file.prefix";
    // 你的 bucket，j3-communication
    private final String bucket = "se-project-river";
    // 你的 bucket 外网访问域名，https://oss-cn-guangzhou.aliyuncs.com
    private final String endpoint = "oss-cn-hangzhou.aliyuncs.com";
    // 拼接返回url要用的，bucket + 域名 例如： j3-communication.oss-cn-guangzhou.aliyuncs.com
    private final String bucketHost = "se-project-river.oss-cn-hangzhou.aliyuncs.com";
    // 这两个就没啥好说的了
    private final String accessKeyId = "LTAI5tL9N8NuQ5ycFuvxwFWb";
    private final String accessKeySecret = "I4srXvGd4MaqjQ9GbMTMFw6m2S7GKJ";
    // 生成文件路径用的，根据日期
    private final SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

    /**
     * 单个文件上传
     * @param file
     * @return
     */
    public String upload(MultipartFile file) {
        // 路径拼接
        String dataPath = format.format(new Date());
        // 文件名称生成
        String uuid = UUID.randomUUID().toString().replace("-", "");
        String path = prefix + "/" + dataPath + "/" + uuid + file.getOriginalFilename();
        try {
            // 上传
            ossUpload(bucket, path, file.getInputStream());
        } catch (IOException e) {
            //throw new SysException("文件上传失败！");
        }
        // 因为 oss 不会返回访问 url 所以我们自己可以拼接一个：
        // 协议（https://） + 域名访问地址（j3-communication.oss-cn-guangzhou.aliyuncs.com） + 自己拼接的路径（xxx/xxx/a.jpg）
        return "https://" + bucketHost + "/" + path;
    }


    /**
     * 多个文件上传
     * @param files
     * @return
     */
    public List<String> upload(MultipartFile[] files) {
        List<String> usrList = new ArrayList<>(files.length);
        for (MultipartFile file : files) {
            usrList.add(upload(file));
        }
        return usrList;
    }


    /**
     * 具体上传代码
     * @param bucket backet名称
     * @param path 路径
     * @param inputStream 文件流
     * @return
     */
    private PutObjectResult ossUpload(String bucket, String path, InputStream inputStream) {
        OSS ossClient = null;
        PutObjectResult putObjectResult = null;
        try {
            // 创建OSSClient实例。
            ossClient = new OSSClientBuilder().build(endpoint
                    , accessKeyId
                    , accessKeySecret);
            // 通过文件流的形式上传文件
            putObjectResult = ossClient.putObject(bucket, path, inputStream);
        } catch (Exception e) {
            //错误处理
            log.error("==========ossUpload_error, {}", e);
            //throw new SysException("文件上传失败！");
        } finally {
            //资源关闭
            assert ossClient != null;
            ossClient.shutdown();
        }
        return putObjectResult;
    }


    /**
     * 单个删除
     * @param url 文件url
     */
    public void delete(String url) {
        // 处理 url
        log.info("============入参：{}", url);
        String path = url.substring(("https://" + bucketHost + "/").length());
        log.info("============path：{}", path);
        ossDelete(bucket, Collections.singletonList(path));
    }

    /**
     * 多个删除
     * @param urlList
     */
    public void delete(List<String> urlList) {
        List<String> keys = new ArrayList<>(urlList.size());
        for (String url : urlList) {
            keys.add(url.substring(("https://" + bucketHost + "/").length()));
        }
        ossDelete(bucket, keys);
    }

    /**
     * 具体删除代码
     * @param bucket backet
     * @param pathList 文件url列表
     */
    private void ossDelete(String bucket, List<String> pathList) {
        OSS ossClient = null;
        try {
            // 创建OSSClient实例。
            ossClient = new OSSClientBuilder().build(endpoint
                    , accessKeyId
                    , accessKeySecret);
            // ossClient.deleteObject(bucket, path);
            DeleteObjectsRequest deleteObjectsRequest = new DeleteObjectsRequest(bucket);
            deleteObjectsRequest.setKeys(pathList);
            ossClient.deleteObjects(deleteObjectsRequest);
        } catch (Exception e) {
            //错误处理
            log.error("==========ossUpload_error, {}", e);
            //throw new SysException("文件删除失败！");
        } finally {
            //资源关闭
            assert ossClient != null;
            ossClient.shutdown();
        }
    }
}
