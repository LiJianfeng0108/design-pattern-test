package cn.ljf.task1.factory;

import cn.ljf.task1.reader.GifReader;
import cn.ljf.task1.reader.ImageReader;

public class GifReaderFactory implements ImageReaderFactory {//gif��ʽ��ȡ������
	public ImageReader createImageReader() {
		System.out.println("����GIF��ʽ��ͼƬ��ȡ����");
		return new GifReader();
	}
}
