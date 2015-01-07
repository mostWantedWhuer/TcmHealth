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

			map.put("name", "中经堂");
			map.put("price", "人均：147");
			map.put("addr", "新街口/金轮 腰腿调理套餐");
			map.put("distance", "5.8km");
			map.put("tuan", false);
			map.put("promo", false);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 50);
			map.put("area", "鼓楼区");
			list.add(map);

			map = new HashMap<String, Object>();
			map.put("name", "玉玺堂藏式养生会所");
			map.put("price", "人均：285");
			map.put("addr", "新街口/金轮 养生套餐");
			map.put("distance", "890m");
			map.put("tuan", false);
			map.put("promo", false);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 50);
			map.put("area", "鼓楼区");
			list.add(map);

			map = new HashMap<String, Object>();
			map.put("name", "宗元堂");
			map.put("price", "人均：60");
			map.put("addr", "新街口/金轮 脊柱整复养生套餐");
			map.put("distance", "8.1km");
			map.put("tuan", false);
			map.put("promo", true);
			map.put("card", true);
			map.put("checkin", false);
			map.put("star", 45);
			map.put("area", "鼓楼区");
			list.add(map);
			
			map = new HashMap<String, Object>();
			map.put("name", "贡享足道");
			map.put("price", "人均：60");
			map.put("addr", "新街口/金轮 中药足浴");
			map.put("distance", "10km");
			map.put("tuan", false);
			map.put("promo", false);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 40);
			map.put("area", "鼓楼区");
			list.add(map);
			
			map = new HashMap<String, Object>();
			map.put("name", "丽声堂");
			map.put("price", "人均：69");
			map.put("addr", "新街口/金轮 推拿套餐");
			map.put("distance", "5.0km");
			map.put("tuan", true);
			map.put("promo", true);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 45);
			map.put("area", "鼓楼区");
			list.add(map);
			
			map = new HashMap<String, Object>();
			map.put("name", "康源足疗推拿养生馆");
			map.put("price", "人均：240");
			map.put("addr", "新街口/金轮 足疗SPA套餐");
			map.put("distance", "7.4km");
			map.put("tuan", false);
			map.put("promo", false);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 50);
			map.put("area", "雨花台区");
			list.add(map);
		}
		
		if(i == 1)
		{
			Map<String, Object> map = new HashMap<String, Object>();

			map.put("name", "陆琴脚艺");
			map.put("price", "人均：136");
			map.put("addr", "【8店通用】 原生态绞股蓝药材足浴");
			map.put("distance", "2.0km");
			map.put("tuan", true);
			map.put("promo", false);
			map.put("card", true);
			map.put("checkin", false);
			map.put("star", 50);
			map.put("area", "雨花台区");
			list.add(map);
			
			map = new HashMap<String, Object>();
			map.put("name", "康源足疗推拿养生馆");
			map.put("price", "人均：324");
			map.put("addr", "【2店通用】 足疗推油");
			map.put("distance", "4.0km");
			map.put("tuan", false);
			map.put("promo", false);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 50);
			map.put("area", "雨花台区");
			list.add(map);

			map = new HashMap<String, Object>();
			map.put("name", "妃煌泰式会所");
			map.put("price", "人均：76");
			map.put("addr", "应天大街/文体路 妃煌芭提雅经典按摩");
			map.put("distance", "4.4km");
			map.put("tuan", false);
			map.put("promo", false);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 45);
			map.put("area", "雨花台区");
			list.add(map);
			
			map = new HashMap<String, Object>();
			map.put("name", "东方足浴馆");
			map.put("price", "人均：56");
			map.put("addr", "茶南美食/万达金街");
			map.put("distance", "8.0km");
			map.put("tuan", false);
			map.put("promo", false);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 40);
			map.put("area", "江宁区");
			list.add(map);
			
			map = new HashMap<String, Object>();
			map.put("name", "大木桶");
			map.put("price", "人均：63");
			map.put("addr", "中央商场/嘉业国际 精油SPA");
			map.put("distance", "6.5km");
			map.put("tuan", false);
			map.put("promo", true);
			map.put("card", true);
			map.put("checkin", false);
			map.put("star", 45);
			map.put("area", "建邺区");
			list.add(map);
			
			map = new HashMap<String, Object>();
			map.put("name", "坤和堂养生馆");
			map.put("price", "人均：246");
			map.put("addr", "建邺万达 保健套餐");
			map.put("distance", "6.6km");
			map.put("tuan", false);
			map.put("promo", false);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 50);
			map.put("area", "建邺区");
			list.add(map);
		}
		
		if(i == 2)
		{
			Map<String, Object> map = new HashMap<String, Object>();

			map.put("name", "推拿按摩");
			map.put("price", "人均：224");
			map.put("addr", "莫愁湖/水西门 精油套餐");
			map.put("distance", "2.9km");
			map.put("tuan", true);
			map.put("promo", false);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 40);
			map.put("area", "建邺区");
			list.add(map);

			map = new HashMap<String, Object>();
			map.put("name", "梵芝圣原养生");
			map.put("price", "人均：27");
			map.put("addr", "玄武区 艾舒葶通按摩");
			map.put("distance", "6.8km");
			map.put("tuan", false);
			map.put("promo", false);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 50);
			map.put("area", "玄武区");
			list.add(map);

			map = new HashMap<String, Object>();
			map.put("name", "泽尚堂中医养生");
			map.put("price", "人均：48");
			map.put("addr", "营苑北路/墨香路 中药推拿");
			map.put("distance", "6.8km");
			map.put("tuan", false);
			map.put("promo", false);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 50);
			map.put("area", "玄武区");
			list.add(map);
			
			map = new HashMap<String, Object>();
			map.put("name", "紫莱SPA会所");
			map.put("price", "人均：62");
			map.put("addr", "卫岗/下马坊 全身体膜");
			map.put("distance", "5.2km");
			map.put("tuan", false);
			map.put("promo", false);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 40);
			map.put("area", "玄武区");
			list.add(map);
			
			map = new HashMap<String, Object>();
			map.put("name", "手技王推拿脊整中心");
			map.put("price", "人均：227");
			map.put("addr", "四牌楼/成贤街 养生全身推拿");
			map.put("distance", "10km");
			map.put("tuan", false);
			map.put("promo", true);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 45);
			map.put("area", "玄武区");
			list.add(map);
			
			map = new HashMap<String, Object>();
			map.put("name", "耶里夏丽新疆菜（政通店））");
			map.put("price", "人均：69");
			map.put("addr", "五角场/大学区 新疆/清真");
			map.put("distance", "6.6km");
			map.put("tuan", false);
			map.put("promo", true);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 50);
			map.put("area", "玄武区");
			list.add(map);
		}
		
		if(i == 3)
		{
			Map<String, Object> map = new HashMap<String, Object>();

			map.put("name", "窝");
			map.put("price", "人均：67");
			map.put("addr", "静安寺 咖啡厅");
			map.put("distance", "5.4km");
			map.put("tuan", true);
			map.put("promo", false);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 45);
			map.put("area", "长宁区");
			list.add(map);

			map = new HashMap<String, Object>();
			map.put("name", "泰妃阁（虹口龙之梦店）");
			map.put("price", "人均：71");
			map.put("addr", "鲁迅公园 东南亚菜");
			map.put("distance", "10km");
			map.put("tuan", false);
			map.put("promo", true);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 40);
			map.put("area", "青浦区");
			list.add(map);

			map = new HashMap<String, Object>();
			map.put("name", "三宝粥铺");
			map.put("price", "人均：29");
			map.put("addr", "人民广场 快餐简餐");
			map.put("distance", "8.1km");
			map.put("tuan", false);
			map.put("promo", true);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 45);
			map.put("area", "杨浦区");
			list.add(map);
			
			map = new HashMap<String, Object>();
			map.put("name", "小山日本料理");
			map.put("price", "人均：183");
			map.put("addr", "新天地 日本料理");
			map.put("distance", "7.4km");
			map.put("tuan", false);
			map.put("promo", false);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 50);
			map.put("area", "浦东新区");
			list.add(map);
			
			map = new HashMap<String, Object>();
			map.put("name", "莫尔顿牛排坊");
			map.put("price", "人均：602");
			map.put("addr", "陆家嘴 牛排");
			map.put("distance", "10km");
			map.put("tuan", false);
			map.put("promo", true);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 05);
			map.put("area", "浦东新区");
			list.add(map);
			
			map = new HashMap<String, Object>();
			map.put("name", "小小花园");
			map.put("price", "人均：69");
			map.put("addr", "徐家汇 咖啡");
			map.put("distance", "3.7km");
			map.put("tuan", false);
			map.put("promo", true);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 45);
			map.put("area", "浦东新区");
			list.add(map);
		}
		
		if(i == 4)
		{
			Map<String, Object> map = new HashMap<String, Object>();

			map.put("name", "阿久");
			map.put("price", "人均：103");
			map.put("addr", "中山公园 日本料理");
			map.put("distance", "2.4km");
			map.put("tuan", false);
			map.put("promo", false);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 40);
			map.put("area", "徐汇区");
			list.add(map);

			map = new HashMap<String, Object>();
			map.put("name", "椰香天堂");
			map.put("price", "人均：179");
			map.put("addr", "静安寺 泰过菜");
			map.put("distance", "5.1km");
			map.put("tuan", false);
			map.put("promo", true);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 50);
			map.put("area", "徐汇区");
			list.add(map);

			map = new HashMap<String, Object>();
			map.put("name", "萤七人间");
			map.put("price", "人均：137");
			map.put("addr", "静安寺 创意菜");
			map.put("distance", "7.1km");
			map.put("tuan", false);
			map.put("promo", true);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 45);
			map.put("area", "徐汇区");
			list.add(map);
			
			map = new HashMap<String, Object>();
			map.put("name", "仙炙轩（汾阳路店）");
			map.put("price", "人均：457");
			map.put("addr", "音乐学院 日本烧烤");
			map.put("distance", "5.1km");
			map.put("tuan", false);
			map.put("promo", false);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 50);
			map.put("area", "虹口区");
			list.add(map);
			
			map = new HashMap<String, Object>();
			map.put("name", "庄源");
			map.put("price", "人均：224");
			map.put("addr", "新天地 西班牙菜");
			map.put("distance", "7.4km");
			map.put("tuan", true);
			map.put("promo", true);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 40);
			map.put("area", "虹口区");
			list.add(map);
			
			map = new HashMap<String, Object>();
			map.put("name", "柚子（陆家嘴店）");
			map.put("price", "人均：206");
			map.put("addr", "陆家嘴 日本料理");
			map.put("distance", "10km");
			map.put("tuan", false);
			map.put("promo", true);
			map.put("card", false);
			map.put("checkin", false);
			map.put("star", 45);
			map.put("area", "虹口区");
			list.add(map);
		}	
		return list;
	}
}