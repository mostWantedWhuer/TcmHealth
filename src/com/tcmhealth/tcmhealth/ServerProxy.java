package com.tcmhealth.tcmhealth;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import android.os.Parcelable.Creator;

public class ServerProxy
{
	private int i = 0;
	private List<Map<String, Object>> list;
	private Object obj;
	
	public void sendRequest(final ServerListener listener)
	{	
		final int num = i;
		if(i < 5)
		{
			Thread thread = new Thread() 
			{
				public void run() 
				{
					try
					{
						this.sleep(1000);
					}
					catch(Exception e)
					{
						
					}
					
					list = createData(num);
					if(i == 4)
					{
						listener.serverDataArrived(list, true);
					}
					else
					{
						listener.serverDataArrived(list, false);
					}
					
				}
			};
			thread.start();
			i++;
		}
		
		
	}
	
	private List<Map<String, Object>> createData(int i)
	{
		List<Map<String, Object>> list = new LinkedList<Map<String, Object>>();
		
		if(i == 0)
		{
			Map<String, Object> map = new HashMap<String, Object>();

			map.put("name", "�о���");
			map.put("price", "�˾���147");
			map.put("addr", "�½ֿ�/���� ���ȵ����ײ�");
			map.put("distance", "5.8km");
			map.put("tuan", false);
			map.put("promo", false);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 50);
			map.put("area", "��¥��");
			list.add(map);

			map = new HashMap<String, Object>();
			map.put("name", "�����ò�ʽ��������");
			map.put("price", "�˾���285");
			map.put("addr", "�½ֿ�/���� �����ײ�");
			map.put("distance", "890m");
			map.put("tuan", false);
			map.put("promo", false);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 50);
			map.put("area", "��¥��");
			list.add(map);

			map = new HashMap<String, Object>();
			map.put("name", "��Ԫ��");
			map.put("price", "�˾���60");
			map.put("addr", "�½ֿ�/���� �������������ײ�");
			map.put("distance", "8.1km");
			map.put("tuan", false);
			map.put("promo", true);
			map.put("card", true);
			map.put("checkin", false);
			map.put("star", 45);
			map.put("area", "��¥��");
			list.add(map);
			
			map = new HashMap<String, Object>();
			map.put("name", "�������");
			map.put("price", "�˾���60");
			map.put("addr", "�½ֿ�/���� ��ҩ��ԡ");
			map.put("distance", "10km");
			map.put("tuan", false);
			map.put("promo", false);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 40);
			map.put("area", "��¥��");
			list.add(map);
			
			map = new HashMap<String, Object>();
			map.put("name", "������");
			map.put("price", "�˾���69");
			map.put("addr", "�½ֿ�/���� �����ײ�");
			map.put("distance", "5.0km");
			map.put("tuan", true);
			map.put("promo", true);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 45);
			map.put("area", "��¥��");
			list.add(map);
			
			map = new HashMap<String, Object>();
			map.put("name", "��Դ��������������");
			map.put("price", "�˾���240");
			map.put("addr", "�½ֿ�/���� ����SPA�ײ�");
			map.put("distance", "7.4km");
			map.put("tuan", false);
			map.put("promo", false);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 50);
			map.put("area", "�껨̨��");
			list.add(map);
		}
		
		if(i == 1)
		{
			Map<String, Object> map = new HashMap<String, Object>();

			map.put("name", "½�ٽ���");
			map.put("price", "�˾���136");
			map.put("addr", "��8��ͨ�á� ԭ��̬�ʹ���ҩ����ԡ");
			map.put("distance", "2.0km");
			map.put("tuan", true);
			map.put("promo", false);
			map.put("card", true);
			map.put("checkin", false);
			map.put("star", 50);
			map.put("area", "�껨̨��");
			list.add(map);
			
			map = new HashMap<String, Object>();
			map.put("name", "��Դ��������������");
			map.put("price", "�˾���324");
			map.put("addr", "��2��ͨ�á� ��������");
			map.put("distance", "4.0km");
			map.put("tuan", false);
			map.put("promo", false);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 50);
			map.put("area", "�껨̨��");
			list.add(map);

			map = new HashMap<String, Object>();
			map.put("name", "����̩ʽ����");
			map.put("price", "�˾���76");
			map.put("addr", "Ӧ����/����· ���Ͱ����ž��䰴Ħ");
			map.put("distance", "4.4km");
			map.put("tuan", false);
			map.put("promo", false);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 45);
			map.put("area", "�껨̨��");
			list.add(map);
			
			map = new HashMap<String, Object>();
			map.put("name", "������ԡ��");
			map.put("price", "�˾���56");
			map.put("addr", "������ʳ/�����");
			map.put("distance", "8.0km");
			map.put("tuan", false);
			map.put("promo", false);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 40);
			map.put("area", "������");
			list.add(map);
			
			map = new HashMap<String, Object>();
			map.put("name", "��ľͰ");
			map.put("price", "�˾���63");
			map.put("addr", "�����̳�/��ҵ���� ����SPA");
			map.put("distance", "6.5km");
			map.put("tuan", false);
			map.put("promo", true);
			map.put("card", true);
			map.put("checkin", false);
			map.put("star", 45);
			map.put("area", "������");
			list.add(map);
			
			map = new HashMap<String, Object>();
			map.put("name", "������������");
			map.put("price", "�˾���246");
			map.put("addr", "������� �����ײ�");
			map.put("distance", "6.6km");
			map.put("tuan", false);
			map.put("promo", false);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 50);
			map.put("area", "������");
			list.add(map);
		}
		
		if(i == 2)
		{
			Map<String, Object> map = new HashMap<String, Object>();

			map.put("name", "���ð�Ħ");
			map.put("price", "�˾���224");
			map.put("addr", "Ī���/ˮ���� �����ײ�");
			map.put("distance", "2.9km");
			map.put("tuan", true);
			map.put("promo", false);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 40);
			map.put("area", "������");
			list.add(map);

			map = new HashMap<String, Object>();
			map.put("name", "��֥ʥԭ����");
			map.put("price", "�˾���27");
			map.put("addr", "������ ������ͨ��Ħ");
			map.put("distance", "6.8km");
			map.put("tuan", false);
			map.put("promo", false);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 50);
			map.put("area", "������");
			list.add(map);

			map = new HashMap<String, Object>();
			map.put("name", "��������ҽ����");
			map.put("price", "�˾���48");
			map.put("addr", "ӪԷ��·/ī��· ��ҩ����");
			map.put("distance", "6.8km");
			map.put("tuan", false);
			map.put("promo", false);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 50);
			map.put("area", "������");
			list.add(map);
			
			map = new HashMap<String, Object>();
			map.put("name", "����SPA����");
			map.put("price", "�˾���62");
			map.put("addr", "����/���� ȫ����Ĥ");
			map.put("distance", "5.2km");
			map.put("tuan", false);
			map.put("promo", false);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 40);
			map.put("area", "������");
			list.add(map);
			
			map = new HashMap<String, Object>();
			map.put("name", "�ּ������ü�������");
			map.put("price", "�˾���227");
			map.put("addr", "����¥/���ͽ� ����ȫ������");
			map.put("distance", "10km");
			map.put("tuan", false);
			map.put("promo", true);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 45);
			map.put("area", "������");
			list.add(map);
			
			map = new HashMap<String, Object>();
			map.put("name", "Ү�������½��ˣ���ͨ�꣩��");
			map.put("price", "�˾���69");
			map.put("addr", "��ǳ�/��ѧ�� �½�/����");
			map.put("distance", "6.6km");
			map.put("tuan", false);
			map.put("promo", true);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 50);
			map.put("area", "������");
			list.add(map);
		}
		
		if(i == 3)
		{
			Map<String, Object> map = new HashMap<String, Object>();

			map.put("name", "��");
			map.put("price", "�˾���67");
			map.put("addr", "������ ������");
			map.put("distance", "5.4km");
			map.put("tuan", true);
			map.put("promo", false);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 45);
			map.put("area", "������");
			list.add(map);

			map = new HashMap<String, Object>();
			map.put("name", "̩���󣨺����֮�ε꣩");
			map.put("price", "�˾���71");
			map.put("addr", "³Ѹ��԰ �����ǲ�");
			map.put("distance", "10km");
			map.put("tuan", false);
			map.put("promo", true);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 40);
			map.put("area", "������");
			list.add(map);

			map = new HashMap<String, Object>();
			map.put("name", "��������");
			map.put("price", "�˾���29");
			map.put("addr", "����㳡 ��ͼ��");
			map.put("distance", "8.1km");
			map.put("tuan", false);
			map.put("promo", true);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 45);
			map.put("area", "������");
			list.add(map);
			
			map = new HashMap<String, Object>();
			map.put("name", "Сɽ�ձ�����");
			map.put("price", "�˾���183");
			map.put("addr", "����� �ձ�����");
			map.put("distance", "7.4km");
			map.put("tuan", false);
			map.put("promo", false);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 50);
			map.put("area", "�ֶ�����");
			list.add(map);
			
			map = new HashMap<String, Object>();
			map.put("name", "Ī����ţ�ŷ�");
			map.put("price", "�˾���602");
			map.put("addr", "½���� ţ��");
			map.put("distance", "10km");
			map.put("tuan", false);
			map.put("promo", true);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 05);
			map.put("area", "�ֶ�����");
			list.add(map);
			
			map = new HashMap<String, Object>();
			map.put("name", "СС��԰");
			map.put("price", "�˾���69");
			map.put("addr", "��һ� ����");
			map.put("distance", "3.7km");
			map.put("tuan", false);
			map.put("promo", true);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 45);
			map.put("area", "�ֶ�����");
			list.add(map);
		}
		
		if(i == 4)
		{
			Map<String, Object> map = new HashMap<String, Object>();

			map.put("name", "����");
			map.put("price", "�˾���103");
			map.put("addr", "��ɽ��԰ �ձ�����");
			map.put("distance", "2.4km");
			map.put("tuan", false);
			map.put("promo", false);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 40);
			map.put("area", "�����");
			list.add(map);

			map = new HashMap<String, Object>();
			map.put("name", "Ҭ������");
			map.put("price", "�˾���179");
			map.put("addr", "������ ̩����");
			map.put("distance", "5.1km");
			map.put("tuan", false);
			map.put("promo", true);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 50);
			map.put("area", "�����");
			list.add(map);

			map = new HashMap<String, Object>();
			map.put("name", "ө���˼�");
			map.put("price", "�˾���137");
			map.put("addr", "������ �����");
			map.put("distance", "7.1km");
			map.put("tuan", false);
			map.put("promo", true);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 45);
			map.put("area", "�����");
			list.add(map);
			
			map = new HashMap<String, Object>();
			map.put("name", "������������·�꣩");
			map.put("price", "�˾���457");
			map.put("addr", "����ѧԺ �ձ��տ�");
			map.put("distance", "5.1km");
			map.put("tuan", false);
			map.put("promo", false);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 50);
			map.put("area", "�����");
			list.add(map);
			
			map = new HashMap<String, Object>();
			map.put("name", "ׯԴ");
			map.put("price", "�˾���224");
			map.put("addr", "����� ��������");
			map.put("distance", "7.4km");
			map.put("tuan", true);
			map.put("promo", true);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 40);
			map.put("area", "�����");
			list.add(map);
			
			map = new HashMap<String, Object>();
			map.put("name", "���ӣ�½����꣩");
			map.put("price", "�˾���206");
			map.put("addr", "½���� �ձ�����");
			map.put("distance", "10km");
			map.put("tuan", false);
			map.put("promo", true);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 45);
			map.put("area", "�����");
			list.add(map);
		}	
		return list;
	}
}