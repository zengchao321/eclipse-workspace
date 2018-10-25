package day06.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * �ͻ���
 * @author Administrator
 *
 */
public class Client {
	/**
	 * �ͻ��˵���������
	 */
	public void start(){
		try{
			/*
			 * �����˷������ݵĲ���:
			 * 1:������Socket(һ�ξ���)
			 * 2:׼������
			 * 3:�������ݰ�
			 * 4:�����ݴ������ ��3,4��һ����ɵģ�
			 * 5:�����ݰ�ͨ��socket���͸������
			 */
			DatagramSocket socket
						= new DatagramSocket();
			
			String str = "��ã�����ˣ�";
			byte[] data 
						= str.getBytes("UTF-8");
			
			//���:׼����������д��ַ��װ������
			InetAddress address
				= InetAddress.getByName(
													"localhost");
			int port = 8088;	
			//�������Ͱ�
			DatagramPacket sendPacket
				= new DatagramPacket(
					data,
					data.length,
					address,
					port
				);
			//�������ͳ�ȥ
			socket.send(sendPacket);
			
			/*
			 * ���շ���˷��ͻ�������Ϣ
			 */
			data = new byte[100];
			DatagramPacket recvPacket
				= new DatagramPacket(
						data,
						data.length
				);
			//�������ݵ�����
			//ע��,�÷����Ǹ�����������
			socket.receive(recvPacket);
			
			//���������
			byte[] d = recvPacket.getData();
			//��Ч���ݳ���
			int dlen = recvPacket.getLength();
			/**
			 * String(
			 * 	byte[] b,
			 * 	int offset,
			 *  int len,
			 *  String charsetName)
			 *  ���������ֽ������У���offset��
			 *  ��ʼ����len���ֽڣ��ٸ��ݸ������ַ���
			 *  ת��Ϊ�ַ���
			 */
			String info 
				= new String(d,0,dlen,"UTF-8");
			System.out.println("�����˵:"+info);
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		Client client = new Client();
		client.start();
	}
}
