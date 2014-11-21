package org.cxf.uploadservice;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.cxf.beanupload.FileUploader;

@WebService
public interface UploadSEI {
	void uploadFile(@WebParam(name="Dfile") FileUploader Dfile);
}
