package com.msdosadmin.NMSL_Overlay;

import java.awt.Color;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JLabel;

import org.apache.commons.httpclient.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class Tools {
	public static int count;
	public static HashMap<String, String> canche = new HashMap<String, String>();

	public static String httpGet(String nmsl) {
		String result = "nmslsb";
		try {
			// 根据地址获取请求
			HttpGet request = new HttpGet(nmsl);
			request.setHeader("procode", "test");

			// 获取当前客户端对
			CloseableHttpClient httpclient = HttpClients.createDefault();
			// 通过请求对象获取响应对象
			CloseableHttpResponse response = httpclient.execute(request);
			// 判断请求结果状态码
			if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				result = EntityUtils.toString(response.getEntity());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public static String getUUID(String name) {
		String api = httpGet("https://api.mojang.com/users/profiles/minecraft/" + name);
		if (api.indexOf(name) > -1) {
			JSONObject juuid = new JSONObject().parseObject(api);
			String uuid = juuid.getString("id");
			System.out.println("DEBUG - " + name + " -> " + uuid);
			return uuid;
		} else {
			System.out.println("DEBUG - " + name + " -> NONE");
			return "NMSL*";
		}
	}

	@SuppressWarnings("deprecation")
	public static String getStats(String uuid, String name) {
		if (uuid.equals("NMSL*")) {
			System.out.println("{\"name\":\"" + name + "\",\"tag\":[\"N\",\"\"],\"level\":0,\"fk\":0,\"fkdr\":0,\"win\":0,\"wlr\":0,\"bb\":0,\"bl\":0,\"bblr\":0,\"colors\":[\"ORANGE\",\"WHITE\",\"LIGHT_GRAY\",\"LIGHT_GRAY\",\"LIGHT_GRAY\",\"LIGHT_GRAY\",\"LIGHT_GRAY\",\"LIGHT_GRAY\",\"LIGHT_GRAY\",\"LIGHT_GRAY\",\"LIGHT_GRAY\"]}");
			return "{\"name\":\"" + name + "\",\"tag\":[\"N\",\"\"],\"level\":0,\"fk\":0,\"fkdr\":0,\"win\":0,\"wlr\":0,\"bb\":0,\"bl\":0,\"bblr\":0,\"colors\":[\"ORANGE\",\"WHITE\",\"LIGHT_GRAY\",\"LIGHT_GRAY\",\"LIGHT_GRAY\",\"LIGHT_GRAY\",\"LIGHT_GRAY\",\"LIGHT_GRAY\",\"LIGHT_GRAY\",\"LIGHT_GRAY\",\"LIGHT_GRAY\"]}";
		}
		String api = httpGet("https://api.hypixel.net/player?key=" + NMSL.key + "&&uuid=" + uuid);
		JSONObject json = new JSONObject().parseObject(api);
		// 数据整理
		int exp = json.getJSONObject("player").getJSONObject("stats").getJSONObject("Bedwars").getIntValue("Experience");
		int level = getLv(exp * 1.0);
		int fk = json.getJSONObject("player").getJSONObject("stats").getJSONObject("Bedwars").getIntValue("final_kills_bedwars");
		int fd = json.getJSONObject("player").getJSONObject("stats").getJSONObject("Bedwars").getIntValue("final_deaths_bedwars");
		double fkdr;
		if (fd != 0) {
			fkdr = (fk * 1.0) / (fd * 1.0);
			BigDecimal two = new BigDecimal(fkdr);
			fkdr = two.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		} else {
			fkdr = fk;
		}
		int win = json.getJSONObject("player").getJSONObject("stats").getJSONObject("Bedwars").getIntValue("wins_bedwars");
		int loss = json.getJSONObject("player").getJSONObject("stats").getJSONObject("Bedwars").getIntValue("losses_bedwars");
		double wlr;
		if (loss != 0) {
			wlr = (win * 1.0) / (loss * 1.0);
			BigDecimal two1 = new BigDecimal(wlr);
			wlr = two1.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		} else {
			wlr = win;
		}
		int bb = json.getJSONObject("player").getJSONObject("stats").getJSONObject("Bedwars").getIntValue("beds_broken_bedwars");
		int bl = json.getJSONObject("player").getJSONObject("stats").getJSONObject("Bedwars").getIntValue("beds_lost_bedwars");
		String rank = json.getJSONObject("player").getString("newPackageRank");
		double bblr;
		if (bl != 0) {
			bblr = (bb * 1.0) / (bl * 1.0);
			BigDecimal two11 = new BigDecimal(bblr);
			bblr = two11.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		} else {
			bblr = bb;
		}

		String channel = json.getJSONObject("player").getString("channel");
		if (channel == null || channel.equals(null)) {
			channel = "ALL";
		}
		List<String> t = new ArrayList<>();
		List<String> l = new ArrayList<>();
		// 贴标签
		if (name.equals(NMSL.username)) {
			t.add("Y");
			l.add("GREEN");
		}
		if (channel.indexOf("PARTY") > -1) {
			t.add("P");
			l.add("BLUE");
		}
		if (level < 150 && fd / (loss + 0.1) < 0.75 && fkdr < 1.5) {
			if (t.size() < 2) {
				t.add("S");
				l.add("RED");
			}
		}
		if ((wlr * 2.5 < fkdr && fkdr < 12.3 && fkdr > 0.65) || (level > 150 && wlr < 0.65)) {
			if (t.size() < 2) {
				t.add("H");
				l.add("RED");
			}
		}
		if ((level < 15 && fkdr > 3.2) || (level > 15 && level < 100 && level / fkdr <= 15)) {
			if (t.size() < 2) {
				t.add("A");
				l.add("YELLOW");
			}
		}
		if (t.size() < 2) {
			t.add("");
			l.add("WHITE");
		}
		if (t.size() < 2) {
			t.add("");
			l.add("WHITE");
		}
		// 数据颜色 - Level
		if (level < 100) {
			l.add("DARK_GRAY");
		} else if (level < 200) {
			l.add("WHITE");
		} else if (level < 300) {
			l.add("YELLOW");
		} else if (level < 400) {
			l.add("CYAN");
		} else if (level < 500) {
			l.add("GREEN");
		} else if (level < 600) {
			l.add("BLUE");
		} else if (level < 700) {
			l.add("RED");
		} else if (level < 800) {
			l.add("PINK");
		} else if (level < 900) {
			l.add("BLUE");
		} else if (level < 1000) {
			l.add("ORANGE");
		} else {
			l.add("ORANGE");
		}
		// Name
		if (rank == null) {
			l.add("WHITE");
		} else {
			if (rank.indexOf("VIP") > -1) {
				l.add("GREEN");
			} else if (rank.indexOf("MVP") > -1) {
				l.add("CYAN");
			} else {
				l.add("WHITE");
			}
		}

		// FKDR
		if (fkdr < 1) {
			l.add("DARK_GRAY");
		} else if (fkdr < 2) {
			l.add("WHITE");
		} else if (fkdr < 5) {
			l.add("GREEN");
		} else if (fkdr < 6.3) {
			l.add("YELLOW");
		} else if (fkdr < 9) {
			l.add("ORANGE");
		} else if (fkdr < 12.6) {
			l.add("PINK");
		} else {
			l.add("RED");
		}
		// FK
		if (fk < 365) {
			l.add("DARK_GRAY");
		} else if (fk < 500) {
			l.add("WHITE");
		} else if (fk < 1000) {
			l.add("GREEN");
		} else if (fk < 1500) {
			l.add("YELLOW");
		} else if (fk < 2500) {
			l.add("ORANGE");
		} else if (fk < 3421) {
			l.add("PINK");
		} else {
			l.add("RED");
		}
		// WLR
		if (wlr < 0.45) {
			l.add("DARK_GRAY");
		} else if (wlr < 0.9) {
			l.add("WHITE");
		} else if (wlr < 1.2) {
			l.add("GREEN");
		} else if (wlr < 2) {
			l.add("YELLOW");
		} else if (wlr < 5.62) {
			l.add("ORANGE");
		} else if (wlr < 8) {
			l.add("PINK");
		} else {
			l.add("RED");
		}
		// WIN
		if (win < 200) {
			l.add("DARK_GRAY");
		} else if (win < 460) {
			l.add("WHITE");
		} else if (win < 580) {
			l.add("GREEN");
		} else if (win < 840) {
			l.add("YELLOW");
		} else if (win < 1024) {
			l.add("ORANGE");
		} else if (win < 2048) {
			l.add("PINK");
		} else {
			l.add("RED");
		}
		// BBLR
		if (bblr < 0.2) {
			l.add("DARK_GRAY");
		} else if (bblr < 0.5) {
			l.add("WHITE");
		} else if (bblr < 1.7) {
			l.add("GREEN");
		} else if (bblr < 2.5) {
			l.add("YELLOW");
		} else if (bblr < 3.8) {
			l.add("ORANGE");
		} else if (bblr < 4.9) {
			l.add("PINK");
		} else {
			l.add("RED");
		}
		// BB
		if (bb < 200) {
			l.add("DARK_GRAY");
		} else if (bb < 460) {
			l.add("WHITE");
		} else if (bb < 580) {
			l.add("GREEN");
		} else if (bb < 840) {
			l.add("YELLOW");
		} else if (bb < 1024) {
			l.add("ORANGE");
		} else if (bb < 2048) {
			l.add("PINK");
		} else {
			l.add("RED");
		}
		// BL
		if (bl < 200) {
			l.add("DARK_GRAY");
		} else if (bl < 460) {
			l.add("WHITE");
		} else if (bl < 580) {
			l.add("GREEN");
		} else if (bl < 840) {
			l.add("YELLOW");
		} else if (bl < 1024) {
			l.add("ORANGE");
		} else if (bl < 2048) {
			l.add("PINK");
		} else {
			l.add("RED");
		}
		System.out.println(("{\"name\":\"" + name + "\",\"tag\":" + t.toString().replace("[", "[\"").replace("]", "\"]").replace(",", "\",\"") + ",\"level\":" + level + ",\"fk\":" + fk + ",\"fkdr\":" + fkdr + ",\"win\":" + win + ",\"wlr\":" + wlr + ",\"bb\":" + bb + ",\"bl\":" + bl + ",\"bblr\":" + bblr + ",\"colors\":" + l.toString().replace("[", "[\"").replace("]", "\"]").replace(",", "\",\"") + "}").replace("\\", ""));
		return ("{\"name\":\"" + name + "\",\"tag\":" + t.toString().replace("[", "[\"").replace("]", "\"]").replace(",", "\",\"") + ",\"level\":" + level + ",\"fk\":" + fk + ",\"fkdr\":" + fkdr + ",\"win\":" + win + ",\"wlr\":" + wlr + ",\"bb\":" + bb + ",\"bl\":" + bl + ",\"bblr\":" + bblr + ",\"colors\":" + l.toString().replace("[", "[\"").replace("]", "\"]").replace(",", "\",\"") + "}").replace("\\", "");
	}

	public static int getLv(double bwexp) {
		int lv = 0;
		int every = 487000;
		double part = bwexp / (1.0 * every);
		lv = (int) (lv + (100 * Math.floor(part)));
		int dexp = (int) (bwexp - (every * Math.floor(part)));
		if (dexp >= 500) {
			lv = lv + 1;
			dexp = dexp - 500;
		}
		if (dexp >= 1000) {
			lv = lv + 1;
			dexp = dexp - 1000;
		}
		if (dexp >= 2000) {
			lv = lv + 1;
			dexp = dexp - 2000;
		}
		if (dexp >= 3500) {
			lv = lv + 1;
			dexp = dexp - 3500;
		}
		lv = (int) (lv + Math.floor(dexp / 5000));
		return lv;
	}

	public static void clearList(boolean ss) {
		int count = NMSL.panel_1.getComponentCount();
		for (int i = 0; i < count; i++) {
			Object obj = NMSL.panel_1.getComponent(i);
			if (obj instanceof JLabel) {
				((JLabel) obj).setText("");
				NMSL.PS.setText("说明： [S]Sniper [H]小小外纪 [Y]你自己 [A]高手小号 [P]车队玩家 [N]Nicks 带*为缓存信息 部分算法可能不准确");
			}
		}
		if (ss) {
			AddPlayer s = new AddPlayer(NMSL.username, false);
			s.start();
		}
		Tools.count = 0;
	}

	public static void add(String name) {
		String names;
		System.out.println("ADD接受参数 - " + name);
		if (count < 16) {
			String data = "";
			boolean iscanche;
			if (canche.containsKey(name)) {
				data = canche.get(name);
				names = name + "*";
				System.out.println(name + "使用缓存" + data);
			} else {
				String uuid = getUUID(name);
				data = getStats(uuid, name);
				canche.put(name, data);
				names = name;
			}

			JSONObject json = new JSONObject().parseObject(data);
			String tag1 = json.getJSONArray("tag").getString(0);
			String tag11 = json.getJSONArray("tag").getString(1);
			int lv = json.getIntValue("level");
			int fk = json.getIntValue("fk");
			double fkdr = json.getDouble("fkdr");
			int win = json.getIntValue("win");
			double wlr = json.getDoubleValue("wlr");
			int bb = json.getIntValue("bb");
			double bblr = json.getDoubleValue("bblr");
			int bl = json.getIntValue("bl");
			JSONArray colors = json.getJSONArray("colors");
			count = count + 1;
			System.out.println("使用数据 - " + count + "号 - " + data);
			if (count == 1) {
				NMSL.tag1_1.setText(tag1);
				NMSL.tag1_1.setForeground(color(colors.getString(0)));
				NMSL.tag2_1.setText(tag11);
				NMSL.tag2_1.setForeground(color(colors.getString(1)));
				NMSL.lv_1.setText("" + lv);
				NMSL.lv_1.setForeground(color(colors.getString(2)));
				NMSL.name_1.setText(names);
				NMSL.name_1.setForeground(color(colors.getString(3)));
				NMSL.fkdr_1.setText("" + fkdr);
				NMSL.fkdr_1.setForeground(color(colors.getString(4)));
				NMSL.fk_1.setText("" + fk);
				NMSL.fk_1.setForeground(color(colors.getString(5)));
				NMSL.wlr_1.setText("" + wlr);
				NMSL.wlr_1.setForeground(color(colors.getString(6)));
				NMSL.win_1.setText("" + win);
				NMSL.win_1.setForeground(color(colors.getString(7)));
				NMSL.bblr_1.setText("" + bblr);
				NMSL.bblr_1.setForeground(color(colors.getString(8)));
				NMSL.bb_1.setText("" + bb);
				NMSL.bb_1.setForeground(color(colors.getString(9)));
				NMSL.bl_1.setText("" + bl);
				NMSL.bl_1.setForeground(color(colors.getString(10)));
				NMSL.frame.repaint();
			} else if (count == 2) {
				NMSL.tag1_2.setText(tag1);
				NMSL.tag1_2.setForeground(color(colors.getString(0)));
				NMSL.tag2_2.setText(tag11);
				NMSL.tag2_2.setForeground(color(colors.getString(1)));
				NMSL.lv_2.setText("" + lv);
				NMSL.lv_2.setForeground(color(colors.getString(2)));
				NMSL.name_2.setText(names);
				NMSL.name_2.setForeground(color(colors.getString(3)));
				NMSL.fkdr_2.setText("" + fkdr);
				NMSL.fkdr_2.setForeground(color(colors.getString(4)));
				NMSL.fk_2.setText("" + fk);
				NMSL.fk_2.setForeground(color(colors.getString(5)));
				NMSL.wlr_2.setText("" + wlr);
				NMSL.wlr_2.setForeground(color(colors.getString(6)));
				NMSL.win_2.setText("" + win);
				NMSL.win_2.setForeground(color(colors.getString(7)));
				NMSL.bblr_2.setText("" + bblr);
				NMSL.bblr_2.setForeground(color(colors.getString(8)));
				NMSL.bb_2.setText("" + bb);
				NMSL.bb_2.setForeground(color(colors.getString(9)));
				NMSL.bl_2.setText("" + bl);
				NMSL.bl_2.setForeground(color(colors.getString(10)));
				NMSL.frame.repaint();
			} else if (count == 3) {
				NMSL.tag1_3.setText(tag1);
				NMSL.tag1_3.setForeground(color(colors.getString(0)));
				NMSL.tag2_3.setText(tag11);
				NMSL.tag2_3.setForeground(color(colors.getString(1)));
				NMSL.lv_3.setText("" + lv);
				NMSL.lv_3.setForeground(color(colors.getString(2)));
				NMSL.name_3.setText(names);
				NMSL.name_3.setForeground(color(colors.getString(3)));
				NMSL.fkdr_3.setText("" + fkdr);
				NMSL.fkdr_3.setForeground(color(colors.getString(4)));
				NMSL.fk_3.setText("" + fk);
				NMSL.fk_3.setForeground(color(colors.getString(5)));
				NMSL.wlr_3.setText("" + wlr);
				NMSL.wlr_3.setForeground(color(colors.getString(6)));
				NMSL.win_3.setText("" + win);
				NMSL.win_3.setForeground(color(colors.getString(7)));
				NMSL.bblr_3.setText("" + bblr);
				NMSL.bblr_3.setForeground(color(colors.getString(8)));
				NMSL.bb_3.setText("" + bb);
				NMSL.bb_3.setForeground(color(colors.getString(9)));
				NMSL.bl_3.setText("" + bl);
				NMSL.bl_3.setForeground(color(colors.getString(10)));
				NMSL.frame.repaint();
			} else if (count == 4) {
				NMSL.tag1_4.setText(tag1);
				NMSL.tag1_4.setForeground(color(colors.getString(0)));
				NMSL.tag2_4.setText(tag11);
				NMSL.tag2_4.setForeground(color(colors.getString(1)));
				NMSL.lv_4.setText("" + lv);
				NMSL.lv_4.setForeground(color(colors.getString(2)));
				NMSL.name_4.setText(names);
				NMSL.name_4.setForeground(color(colors.getString(3)));
				NMSL.fkdr_4.setText("" + fkdr);
				NMSL.fkdr_4.setForeground(color(colors.getString(4)));
				NMSL.fk_4.setText("" + fk);
				NMSL.fk_4.setForeground(color(colors.getString(5)));
				NMSL.wlr_4.setText("" + wlr);
				NMSL.wlr_4.setForeground(color(colors.getString(6)));
				NMSL.win_4.setText("" + win);
				NMSL.win_4.setForeground(color(colors.getString(7)));
				NMSL.bblr_4.setText("" + bblr);
				NMSL.bblr_4.setForeground(color(colors.getString(8)));
				NMSL.bb_4.setText("" + bb);
				NMSL.bb_4.setForeground(color(colors.getString(9)));
				NMSL.bl_4.setText("" + bl);
				NMSL.bl_4.setForeground(color(colors.getString(10)));
				NMSL.frame.repaint();
			} else if (count == 5) {
				NMSL.tag1_5.setText(tag1);
				NMSL.tag1_5.setForeground(color(colors.getString(0)));
				NMSL.tag2_5.setText(tag11);
				NMSL.tag2_5.setForeground(color(colors.getString(1)));
				NMSL.lv_5.setText("" + lv);
				NMSL.lv_5.setForeground(color(colors.getString(2)));
				NMSL.name_5.setText(names);
				NMSL.name_5.setForeground(color(colors.getString(3)));
				NMSL.fkdr_5.setText("" + fkdr);
				NMSL.fkdr_5.setForeground(color(colors.getString(4)));
				NMSL.fk_5.setText("" + fk);
				NMSL.fk_5.setForeground(color(colors.getString(5)));
				NMSL.wlr_5.setText("" + wlr);
				NMSL.wlr_5.setForeground(color(colors.getString(6)));
				NMSL.win_5.setText("" + win);
				NMSL.win_5.setForeground(color(colors.getString(7)));
				NMSL.bblr_5.setText("" + bblr);
				NMSL.bblr_5.setForeground(color(colors.getString(8)));
				NMSL.bb_5.setText("" + bb);
				NMSL.bb_5.setForeground(color(colors.getString(9)));
				NMSL.bl_5.setText("" + bl);
				NMSL.bl_5.setForeground(color(colors.getString(10)));
				NMSL.frame.repaint();
			} else if (count == 6) {
				NMSL.tag1_6.setText(tag1);
				NMSL.tag1_6.setForeground(color(colors.getString(0)));
				NMSL.tag2_6.setText(tag11);
				NMSL.tag2_6.setForeground(color(colors.getString(1)));
				NMSL.lv_6.setText("" + lv);
				NMSL.lv_6.setForeground(color(colors.getString(2)));
				NMSL.name_6.setText(names);
				NMSL.name_6.setForeground(color(colors.getString(3)));
				NMSL.fkdr_6.setText("" + fkdr);
				NMSL.fkdr_6.setForeground(color(colors.getString(4)));
				NMSL.fk_6.setText("" + fk);
				NMSL.fk_6.setForeground(color(colors.getString(5)));
				NMSL.wlr_6.setText("" + wlr);
				NMSL.wlr_6.setForeground(color(colors.getString(6)));
				NMSL.win_6.setText("" + win);
				NMSL.win_6.setForeground(color(colors.getString(7)));
				NMSL.bblr_6.setText("" + bblr);
				NMSL.bblr_6.setForeground(color(colors.getString(8)));
				NMSL.bb_6.setText("" + bb);
				NMSL.bb_6.setForeground(color(colors.getString(9)));
				NMSL.bl_6.setText("" + bl);
				NMSL.bl_6.setForeground(color(colors.getString(10)));
				NMSL.frame.repaint();
			} else if (count == 7) {
				NMSL.tag1_7.setText(tag1);
				NMSL.tag1_7.setForeground(color(colors.getString(0)));
				NMSL.tag2_7.setText(tag11);
				NMSL.tag2_7.setForeground(color(colors.getString(1)));
				NMSL.lv_7.setText("" + lv);
				NMSL.lv_7.setForeground(color(colors.getString(2)));
				NMSL.name_7.setText(names);
				NMSL.name_7.setForeground(color(colors.getString(3)));
				NMSL.fkdr_7.setText("" + fkdr);
				NMSL.fkdr_7.setForeground(color(colors.getString(4)));
				NMSL.fk_7.setText("" + fk);
				NMSL.fk_7.setForeground(color(colors.getString(5)));
				NMSL.wlr_7.setText("" + wlr);
				NMSL.wlr_7.setForeground(color(colors.getString(6)));
				NMSL.win_7.setText("" + win);
				NMSL.win_7.setForeground(color(colors.getString(7)));
				NMSL.bblr_7.setText("" + bblr);
				NMSL.bblr_7.setForeground(color(colors.getString(8)));
				NMSL.bb_7.setText("" + bb);
				NMSL.bb_7.setForeground(color(colors.getString(9)));
				NMSL.bl_7.setText("" + bl);
				NMSL.bl_7.setForeground(color(colors.getString(10)));
				NMSL.frame.repaint();
			} else if (count == 8) {
				NMSL.tag1_8.setText(tag1);
				NMSL.tag1_8.setForeground(color(colors.getString(0)));
				NMSL.tag2_8.setText(tag11);
				NMSL.tag2_8.setForeground(color(colors.getString(1)));
				NMSL.lv_8.setText("" + lv);
				NMSL.lv_8.setForeground(color(colors.getString(2)));
				NMSL.name_8.setText(names);
				NMSL.name_8.setForeground(color(colors.getString(3)));
				NMSL.fkdr_8.setText("" + fkdr);
				NMSL.fkdr_8.setForeground(color(colors.getString(4)));
				NMSL.fk_8.setText("" + fk);
				NMSL.fk_8.setForeground(color(colors.getString(5)));
				NMSL.wlr_8.setText("" + wlr);
				NMSL.wlr_8.setForeground(color(colors.getString(6)));
				NMSL.win_8.setText("" + win);
				NMSL.win_8.setForeground(color(colors.getString(7)));
				NMSL.bblr_8.setText("" + bblr);
				NMSL.bblr_8.setForeground(color(colors.getString(8)));
				NMSL.bb_8.setText("" + bb);
				NMSL.bb_8.setForeground(color(colors.getString(9)));
				NMSL.bl_8.setText("" + bl);
				NMSL.bl_8.setForeground(color(colors.getString(10)));
				NMSL.frame.repaint();
			} else if (count == 9) {
				NMSL.tag1_9.setText(tag1);
				NMSL.tag1_9.setForeground(color(colors.getString(0)));
				NMSL.tag2_9.setText(tag11);
				NMSL.tag2_9.setForeground(color(colors.getString(1)));
				NMSL.lv_9.setText("" + lv);
				NMSL.lv_9.setForeground(color(colors.getString(2)));
				NMSL.name_9.setText(names);
				NMSL.name_9.setForeground(color(colors.getString(3)));
				NMSL.fkdr_9.setText("" + fkdr);
				NMSL.fkdr_9.setForeground(color(colors.getString(4)));
				NMSL.fk_9.setText("" + fk);
				NMSL.fk_9.setForeground(color(colors.getString(5)));
				NMSL.wlr_9.setText("" + wlr);
				NMSL.wlr_9.setForeground(color(colors.getString(6)));
				NMSL.win_9.setText("" + win);
				NMSL.win_9.setForeground(color(colors.getString(7)));
				NMSL.bblr_9.setText("" + bblr);
				NMSL.bblr_9.setForeground(color(colors.getString(8)));
				NMSL.bb_9.setText("" + bb);
				NMSL.bb_9.setForeground(color(colors.getString(9)));
				NMSL.bl_9.setText("" + bl);
				NMSL.bl_9.setForeground(color(colors.getString(10)));
				NMSL.frame.repaint();
			} else if (count == 10) {
				NMSL.tag1_10.setText(tag1);
				NMSL.tag1_10.setForeground(color(colors.getString(0)));
				NMSL.tag2_10.setText(tag11);
				NMSL.tag2_10.setForeground(color(colors.getString(1)));
				NMSL.lv_10.setText("" + lv);
				NMSL.lv_10.setForeground(color(colors.getString(2)));
				NMSL.name_10.setText(names);
				NMSL.name_10.setForeground(color(colors.getString(3)));
				NMSL.fkdr_10.setText("" + fkdr);
				NMSL.fkdr_10.setForeground(color(colors.getString(4)));
				NMSL.fk_10.setText("" + fk);
				NMSL.fk_10.setForeground(color(colors.getString(5)));
				NMSL.wlr_10.setText("" + wlr);
				NMSL.wlr_10.setForeground(color(colors.getString(6)));
				NMSL.win_10.setText("" + win);
				NMSL.win_10.setForeground(color(colors.getString(7)));
				NMSL.bblr_10.setText("" + bblr);
				NMSL.bblr_10.setForeground(color(colors.getString(8)));
				NMSL.bb_10.setText("" + bb);
				NMSL.bb_10.setForeground(color(colors.getString(9)));
				NMSL.bl_10.setText("" + bl);
				NMSL.bl_10.setForeground(color(colors.getString(10)));
				NMSL.frame.repaint();
			} else if (count == 11) {
				NMSL.tag1_11.setText(tag1);
				NMSL.tag1_11.setForeground(color(colors.getString(0)));
				NMSL.tag2_11.setText(tag11);
				NMSL.tag2_11.setForeground(color(colors.getString(1)));
				NMSL.lv_11.setText("" + lv);
				NMSL.lv_11.setForeground(color(colors.getString(2)));
				NMSL.name_11.setText(names);
				NMSL.name_11.setForeground(color(colors.getString(3)));
				NMSL.fkdr_11.setText("" + fkdr);
				NMSL.fkdr_11.setForeground(color(colors.getString(4)));
				NMSL.fk_11.setText("" + fk);
				NMSL.fk_11.setForeground(color(colors.getString(5)));
				NMSL.wlr_11.setText("" + wlr);
				NMSL.wlr_11.setForeground(color(colors.getString(6)));
				NMSL.win_11.setText("" + win);
				NMSL.win_11.setForeground(color(colors.getString(7)));
				NMSL.bblr_11.setText("" + bblr);
				NMSL.bblr_11.setForeground(color(colors.getString(8)));
				NMSL.bb_11.setText("" + bb);
				NMSL.bb_11.setForeground(color(colors.getString(9)));
				NMSL.bl_11.setText("" + bl);
				NMSL.bl_11.setForeground(color(colors.getString(10)));
				NMSL.frame.repaint();
			} else if (count == 12) {
				NMSL.tag1_12.setText(tag1);
				NMSL.tag1_12.setForeground(color(colors.getString(0)));
				NMSL.tag2_12.setText(tag11);
				NMSL.tag2_12.setForeground(color(colors.getString(1)));
				NMSL.lv_12.setText("" + lv);
				NMSL.lv_12.setForeground(color(colors.getString(2)));
				NMSL.name_12.setText(names);
				NMSL.name_12.setForeground(color(colors.getString(3)));
				NMSL.fkdr_12.setText("" + fkdr);
				NMSL.fkdr_12.setForeground(color(colors.getString(4)));
				NMSL.fk_12.setText("" + fk);
				NMSL.fk_12.setForeground(color(colors.getString(5)));
				NMSL.wlr_12.setText("" + wlr);
				NMSL.wlr_12.setForeground(color(colors.getString(6)));
				NMSL.win_12.setText("" + win);
				NMSL.win_12.setForeground(color(colors.getString(7)));
				NMSL.bblr_12.setText("" + bblr);
				NMSL.bblr_12.setForeground(color(colors.getString(8)));
				NMSL.bb_12.setText("" + bb);
				NMSL.bb_12.setForeground(color(colors.getString(9)));
				NMSL.bl_12.setText("" + bl);
				NMSL.bl_12.setForeground(color(colors.getString(10)));
				NMSL.frame.repaint();
			} else if (count == 13) {
				NMSL.tag1_13.setText(tag1);
				NMSL.tag1_13.setForeground(color(colors.getString(0)));
				NMSL.tag2_13.setText(tag11);
				NMSL.tag2_13.setForeground(color(colors.getString(1)));
				NMSL.lv_13.setText("" + lv);
				NMSL.lv_13.setForeground(color(colors.getString(2)));
				NMSL.name_13.setText(names);
				NMSL.name_13.setForeground(color(colors.getString(3)));
				NMSL.fkdr_13.setText("" + fkdr);
				NMSL.fkdr_13.setForeground(color(colors.getString(4)));
				NMSL.fk_13.setText("" + fk);
				NMSL.fk_13.setForeground(color(colors.getString(5)));
				NMSL.wlr_13.setText("" + wlr);
				NMSL.wlr_13.setForeground(color(colors.getString(6)));
				NMSL.win_13.setText("" + win);
				NMSL.win_13.setForeground(color(colors.getString(7)));
				NMSL.bblr_13.setText("" + bblr);
				NMSL.bblr_13.setForeground(color(colors.getString(8)));
				NMSL.bb_13.setText("" + bb);
				NMSL.bb_13.setForeground(color(colors.getString(9)));
				NMSL.bl_13.setText("" + bl);
				NMSL.bl_13.setForeground(color(colors.getString(10)));
				NMSL.frame.repaint();
			} else if (count == 14) {
				NMSL.tag1_14.setText(tag1);
				NMSL.tag1_14.setForeground(color(colors.getString(0)));
				NMSL.tag2_14.setText(tag11);
				NMSL.tag2_14.setForeground(color(colors.getString(1)));
				NMSL.lv_14.setText("" + lv);
				NMSL.lv_14.setForeground(color(colors.getString(2)));
				NMSL.name_14.setText(names);
				NMSL.name_14.setForeground(color(colors.getString(3)));
				NMSL.fkdr_14.setText("" + fkdr);
				NMSL.fkdr_14.setForeground(color(colors.getString(4)));
				NMSL.fk_14.setText("" + fk);
				NMSL.fk_14.setForeground(color(colors.getString(5)));
				NMSL.wlr_14.setText("" + wlr);
				NMSL.wlr_14.setForeground(color(colors.getString(6)));
				NMSL.win_14.setText("" + win);
				NMSL.win_14.setForeground(color(colors.getString(7)));
				NMSL.bblr_14.setText("" + bblr);
				NMSL.bblr_14.setForeground(color(colors.getString(8)));
				NMSL.bb_14.setText("" + bb);
				NMSL.bb_14.setForeground(color(colors.getString(9)));
				NMSL.bl_14.setText("" + bl);
				NMSL.bl_14.setForeground(color(colors.getString(10)));
				NMSL.frame.repaint();
			} else if (count == 15) {
				NMSL.tag1_15.setText(tag1);
				NMSL.tag1_15.setForeground(color(colors.getString(0)));
				NMSL.tag2_15.setText(tag11);
				NMSL.tag2_15.setForeground(color(colors.getString(1)));
				NMSL.lv_15.setText("" + lv);
				NMSL.lv_15.setForeground(color(colors.getString(2)));
				NMSL.name_15.setText(names);
				NMSL.name_15.setForeground(color(colors.getString(3)));
				NMSL.fkdr_15.setText("" + fkdr);
				NMSL.fkdr_15.setForeground(color(colors.getString(4)));
				NMSL.fk_15.setText("" + fk);
				NMSL.fk_15.setForeground(color(colors.getString(5)));
				NMSL.wlr_15.setText("" + wlr);
				NMSL.wlr_15.setForeground(color(colors.getString(6)));
				NMSL.win_15.setText("" + win);
				NMSL.win_15.setForeground(color(colors.getString(7)));
				NMSL.bblr_15.setText("" + bblr);
				NMSL.bblr_15.setForeground(color(colors.getString(8)));
				NMSL.bb_15.setText("" + bb);
				NMSL.bb_15.setForeground(color(colors.getString(9)));
				NMSL.bl_15.setText("" + bl);
				NMSL.bl_15.setForeground(color(colors.getString(10)));
				NMSL.frame.repaint();
			} else if (count == 16) {
				NMSL.tag1_16.setText(tag1);
				NMSL.tag1_16.setForeground(color(colors.getString(0)));
				NMSL.tag2_16.setText(tag11);
				NMSL.tag2_16.setForeground(color(colors.getString(1)));
				NMSL.lv_16.setText("" + lv);
				NMSL.lv_16.setForeground(color(colors.getString(2)));
				NMSL.name_16.setText(names);
				NMSL.name_16.setForeground(color(colors.getString(3)));
				NMSL.fkdr_16.setText("" + fkdr);
				NMSL.fkdr_16.setForeground(color(colors.getString(4)));
				NMSL.fk_16.setText("" + fk);
				NMSL.fk_16.setForeground(color(colors.getString(5)));
				NMSL.wlr_16.setText("" + wlr);
				NMSL.wlr_16.setForeground(color(colors.getString(6)));
				NMSL.win_16.setText("" + win);
				NMSL.win_16.setForeground(color(colors.getString(7)));
				NMSL.bblr_16.setText("" + bblr);
				NMSL.bblr_16.setForeground(color(colors.getString(8)));
				NMSL.bb_16.setText("" + bb);
				NMSL.bb_16.setForeground(color(colors.getString(9)));
				NMSL.bl_16.setText("" + bl);
				NMSL.bl_16.setForeground(color(colors.getString(10)));
				NMSL.frame.repaint();
			}
		} else {
			System.out.println("元素爆满");
		}
	}

	public static Color color(String color) {
		String colors = color.replace(" ", "");
		if (color.equals("DARK_GRAY")) {
			return Color.GRAY;
		} else if (colors.equals("WHITE")) {
			return Color.white;
		} else if (colors.equals("GREEN")) {
			return Color.green;
		} else if (colors.equals("YELLOW")) {
			return Color.yellow;
		} else if (colors.equals("ORANGE")) {
			return Color.orange;
		} else if (colors.equals("PINK")) {
			return Color.pink;
		} else if (colors.equals("RED")) {
			return Color.red;
		} else if (colors.equals("CYAN")) {
			return Color.cyan;
		} else if (colors.equals("BLUE")) {
			return Color.blue;
		} else {
			return Color.LIGHT_GRAY;
		}
	}
}
