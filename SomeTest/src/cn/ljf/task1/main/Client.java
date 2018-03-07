package cn.ljf.task1.main;

import cn.ljf.task1.factory.GifReaderFactory;
import cn.ljf.task1.factory.JpegReaderFactory;
import cn.ljf.task1.factory.TiffReaderFactory;

public class Client {
	public static void main(String[] args) {
		new GifReaderFactory()//gif��ȡ������
		.createImageReader()//����������ȡ��
		.readImage();//��ȡͼƬ
		System.out.println();
		
		new JpegReaderFactory()//jpeg��ȡ������
		.createImageReader()//����������ȡ��
		.readImage();//��ȡͼƬ
		System.out.println();
		
		new TiffReaderFactory()//tiff��ȡ������
		.createImageReader()//����������ȡ��
		.readImage();//��ȡͼƬ
		System.out.println();
	}
}
