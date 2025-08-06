package com.fintecho.littleforest.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class Growing_TreeVO {
private int id;
private int user_id;
private int tree_level;
private String tree_name;
private float carbon_saved;
private int water_count;
private int water_stock;
private int biyro_stock;
private Date last_updated;
private Date biyro_used_at;
}
