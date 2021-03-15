package com.dd;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

/**
 * �oͼƬ�������ˮӡ
 * 
 * @author liqiang
 *
 */
public class WaterMarkUtils {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // ԭͼλ��, ���ͼƬλ��, ˮӡ������ɫ, ˮӡ����
    	
    	List<String> names=getFiles("E:\\fighting���ú�ѧϰ\\Pictures\\�½��ļ���");
    	for (int i = 0; i < names.size(); i++) {
    		
           new WaterMarkUtils().mark(names.get(i), "E:\\img\\b"+i+".png",Color.black, "����� 03174005");
		}
    	
        System.out.println("ok");
    }
    public static List<String> getFiles(String path) {
        List<String> files = new ArrayList<String>();
        File file = new File(path);
        File[] tempList = file.listFiles();

        for (int i = 0; i < tempList.length; i++) {
            if (tempList[i].isFile()) {
                files.add(tempList[i].toString());
                //�ļ�����������·��
                //String fileName = tempList[i].getName();
            }
            if (tempList[i].isDirectory()) {
                //����Ͳ��ݹ��ˣ�
            }
        }
        return files;
    }

    /**
     * ͼƬ���ˮӡ
     * 
     * @param srcImgPath
     *            ��Ҫ���ˮӡ��ͼƬ��·��
     * @param outImgPath
     *            ���ˮӡ��ͼƬ���·��
     * @param markContentColor
     *            ˮӡ���ֵ���ɫ
     * @param waterMarkContent
     *            ˮӡ������
     */
    public void mark(String srcImgPath, String outImgPath, Color markContentColor, String waterMarkContent) {
        try {
            // ��ȡԭͼƬ��Ϣ
            File srcImgFile = new File(srcImgPath);
            Image srcImg = ImageIO.read(srcImgFile);
            int srcImgWidth = srcImg.getWidth(null);
            int srcImgHeight = srcImg.getHeight(null);
            // ��ˮӡ
            BufferedImage bufImg = new BufferedImage(srcImgWidth, srcImgHeight, BufferedImage.TYPE_INT_RGB);
            Graphics2D g = bufImg.createGraphics();
            g.drawImage(srcImg, 0, 0, srcImgWidth, srcImgHeight, null);
            // Font font = new Font("Courier New", Font.PLAIN, 12);
            Font font = new Font("΢���ź�", Font.BOLD, 20);
            g.setColor(markContentColor); // ����ͼƬ�ı�������ˮӡ��ɫ

            g.setFont(font);
            int x = srcImgWidth - getWatermarkLength(waterMarkContent, g) - 3;
            int y = srcImgHeight - 3;
            // int x = (srcImgWidth - getWatermarkLength(watermarkStr, g)) / 2;
            // int y = srcImgHeight / 2;
            g.drawString(waterMarkContent, x, y);
            g.dispose();
            // ���ͼƬ
            FileOutputStream outImgStream = new FileOutputStream(outImgPath);
            ImageIO.write(bufImg, "png", outImgStream);
            outImgStream.flush();
            outImgStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * ��ȡˮӡ�����ܳ���
     * 
     * @param waterMarkContent
     *            ˮӡ������
     * @param g
     * @return ˮӡ�����ܳ���
     */
    public int getWatermarkLength(String waterMarkContent, Graphics2D g) {
        return g.getFontMetrics(g.getFont()).charsWidth(waterMarkContent.toCharArray(), 0, waterMarkContent.length());
    }
    
}