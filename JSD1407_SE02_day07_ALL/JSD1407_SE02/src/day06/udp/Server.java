package day06.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * �����
 * @author Administrator
 *
 */
public class Server {
	/**
	 * ����˵���������
	 */
	public void start(){
		try{
			/*
			 * ���հ��Ĳ���:
			 * 1:����Socket(һ��)
			 * 2:����һ�����ʴ�С�İ�
			 * 3:ͨ��socket�������ݵ�����
			 * 4:���ȡ����
			 */
			DatagramSocket socket
					= new DatagramSocket(8088);
			
			byte[] data = new byte[100];
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
			System.out.println("�ͻ���˵:"+info);
			
			//�ظ��ͻ���
			String str = "��ã��ͻ��ˣ�";
			data = str.getBytes("UTF-8");
			
			//���:׼����������д��ַ��װ������
			InetAddress address
				= recvPacket.getAddress();
			int port = recvPacket.getPort();	
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
			
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
	public static void main(String[] args){
		Server server = new Server();
		server.start();
	}
}
