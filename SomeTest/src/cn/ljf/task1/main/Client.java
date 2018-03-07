package cn.ljf.task1.main;

import cn.ljf.task1.factory.GifReaderFactory;
import cn.ljf.task1.factory.JpegReaderFactory;
import cn.ljf.task1.factory.TiffReaderFactory;

public class Client {
	public static void main(String[] args) {
		new GifReaderFactory()//gif读取器工厂
		.createImageReader()//工厂创建读取器
		.readImage();//读取图片
		System.out.println();
		
		new JpegReaderFactory()//jpeg读取器工厂
		.createImageReader()//工厂创建读取器
		.readImage();//读取图片
		System.out.println();
		
		new TiffReaderFactory()//tiff读取器工厂
		.createImageReader()//工厂创建读取器
		.readImage();//读取图片
		System.out.println();
	}
}
