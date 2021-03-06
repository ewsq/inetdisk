package com.kingsj.hadoop.service;

import java.util.List;

import com.kingsj.hadoop.model.Hfile;

public interface HdfsFileService extends BaseService<Hfile, String>{
    
    public List<Hfile> getUserFileTree(String uid, String pid,String ftype);
    
    public List<Hfile> getFileByMd5(String md5);
    
    public List<Hfile> getFileByPid(String pid);
}
