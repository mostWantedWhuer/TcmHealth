package com.tcmhealth.tcmhealth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tcmhealth.tcmhealth.R;

public class CategoryData {
	public static  List<Map<String, Object>> getData() {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

		Map<String, Object> map = new HashMap<String, Object>();

		map.put("title", "足疗");
		map.put("img", R.drawable.food);

		list.add(map);

		map = new HashMap<String, Object>();
		map.put("title", "洗浴");
		map.put("img", R.drawable.happy);

		list.add(map);

		map = new HashMap<String, Object>();

		map.put("title", "推拿");
		map.put("img", R.drawable.life);

		list.add(map);

		map = new HashMap<String, Object>();
		map.put("title", "火疗");
		map.put("img", R.drawable.shopping);

		list.add(map);

		map = new HashMap<String, Object>();

		map.put("title", "汗蒸");
		map.put("img", R.drawable.hotel);

		list.add(map);

		map = new HashMap<String, Object>();
		map.put("title", "精油开背");
		map.put("img", R.drawable.beauty);

		list.add(map);

		map = new HashMap<String, Object>();

		map.put("title", "美肤");
		map.put("img", R.drawable.sports);

		list.add(map);

		map = new HashMap<String, Object>();
		map.put("title", "购物");
		map.put("img", R.drawable.wedding);

		list.add(map);

		map = new HashMap<String, Object>();

		map.put("title", "养生论坛");
		map.put("img", R.drawable.baby);

		list.add(map);

		map = new HashMap<String, Object>();
		map.put("title", "养生教程");
		map.put("img", R.drawable.car);

		list.add(map);
		return list;
	}
}
