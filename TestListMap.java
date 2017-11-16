import java.io.*;
import java.util.Scanner; 
import java.util.*;


public class TestListMap
{
	public static void main(String [] args)
	{
		
		String[] names={"xiaoming","xiaohong","xiaoqiang","xiaogang","xiaowang"};
		String[] descs={"like basketball", "like football","like pingpang", "like basketball", "like football" };
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
		for (int i = 0; i < names.length; i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("name", names[i]);
			map.put("desc", descs[i]);
			data.add(map);
		}
		System.out.println("data=====" + data);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "jinyangyang");
		map.put("like", "like basketball and xiangqi");
		data.add(0,map);
		Iterator<Map<String,Object>> ite=data.iterator();
		while(ite.hasNext())
		{
			System.out.println("ite next is "+ ite.next());
		}
		Map<String, Object> mapx = data.get(2);
		System.out.println("mapx is "+mapx);
		System.out.println("data size is "+data.size());
		data.remove(3);
		System.out.println("data size after is "+data.size());
		System.out.println("data  after is "+data);
		Iterator<Map<String, Object>> itex = data.iterator();
		while(itex.hasNext()){
			Map<String, Object> mapy = itex.next();
			
			int indexA = data.indexOf(mapy);
			int lastindexA = data.lastIndexOf(mapy);
			System.out.println("indexA is " +indexA);
			System.out.println("lastindexA is "+lastindexA);
			System.out.println("itex next is "+mapy);
		}
		Iterator<Map<String, Object>> itey = data.iterator();
		while(itey.hasNext()){
			Map<String, Object> mapz = itey.next();
			int indexB = data.indexOf(mapz);
			System.out.println("indexB is "+indexB);
			if (indexB == 0){
				//mapz.remove("name");
				mapz.put("sex", "man");
			}else{
				mapz.put("sex", "women");
			}
		}
		System.out.println("data after after is  "+data);
		System.out.println("data size after after is "+data.size());
		
		Iterator<Map<String, Object>> ited = data.iterator();
		
		while(ited.hasNext()){
			Map<String, Object> mapd = ited.next();
			int hascode = mapd.hashCode();
			System.out.println("hascode is "+hascode);
			System.out.println("mapd is "+mapd);
			mapd.clear();
		}
		System.out.println("data after after after is "+data);
		
		Iterator<Map<String, Object>> itee = data.iterator();
		System.out.println("itee.hasNext() 1 is "+itee.hasNext());
		System.out.println("itee.hasNext() 2 is "+itee.hasNext());
		while(itee.hasNext()){
			Map<String, Object> mape = itee.next();
			int indexC = data.indexOf(mape);
			System.out.println("indexC is "+indexC);
			//data.remove(indexC);
		}
	}
}


