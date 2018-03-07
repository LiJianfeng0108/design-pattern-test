package cn.ljf.task1.factory;

import cn.ljf.task1.reader.GifReader;
import cn.ljf.task1.reader.ImageReader;

public class GifReaderFactory implements ImageReaderFactory {//gif格式读取器工厂
	public ImageReader createImageReader() {
		System.out.println("创建GIF格式的图片读取器。");
		return new GifReader();
	}
}
