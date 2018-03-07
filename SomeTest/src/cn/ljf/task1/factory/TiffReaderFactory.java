package cn.ljf.task1.factory;

import cn.ljf.task1.reader.ImageReader;
import cn.ljf.task1.reader.TiffReader;

public class TiffReaderFactory implements ImageReaderFactory {//tiff��ʽ��ȡ������
	public ImageReader createImageReader() {
		System.out.println("����TIFF��ʽ��ͼƬ��ȡ����");
		return new TiffReader();
	}
}
