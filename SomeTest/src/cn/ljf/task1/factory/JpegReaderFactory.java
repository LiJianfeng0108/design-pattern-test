package cn.ljf.task1.factory;

import cn.ljf.task1.reader.ImageReader;
import cn.ljf.task1.reader.JpegReader;

public class JpegReaderFactory implements ImageReaderFactory {//JPEG格式读取器工厂
	public ImageReader createImageReader() {
		System.out.println("创建JPEG格式的图片读取器。");
		return new JpegReader();
	}
}
