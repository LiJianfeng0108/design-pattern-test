package cn.ljf.task1.factory;

import cn.ljf.task1.reader.ImageReader;

public interface ImageReaderFactory {//读取器工厂，创建不同读取器
	public ImageReader createImageReader();//创建图片读取器
}
