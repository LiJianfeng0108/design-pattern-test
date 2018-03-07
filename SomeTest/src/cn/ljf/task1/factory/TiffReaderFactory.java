package cn.ljf.task1.factory;

import cn.ljf.task1.reader.ImageReader;
import cn.ljf.task1.reader.TiffReader;

public class TiffReaderFactory implements ImageReaderFactory {//tiff格式读取器工厂
	public ImageReader createImageReader() {
		System.out.println("创建TIFF格式的图片读取器。");
		return new TiffReader();
	}
}
