package cn.ljf.task1.factory;

import cn.ljf.task1.reader.ImageReader;
import cn.ljf.task1.reader.JpegReader;

public class JpegReaderFactory implements ImageReaderFactory {//JPEG��ʽ��ȡ������
	public ImageReader createImageReader() {
		System.out.println("����JPEG��ʽ��ͼƬ��ȡ����");
		return new JpegReader();
	}
}
