package com.fintecho.littleforest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fintecho.littleforest.service.Growing_TreeService;
import com.fintecho.littleforest.vo.Growing_TreeVO;

@RestController
public class PurchaseController {
	
	private final Growing_TreeService growingTreeService;

    public PurchaseController(Growing_TreeService growingTreeService) {
        this.growingTreeService = growingTreeService;
    }

	@PostMapping("/purchase")
	public ResponseEntity<String> purchase(@RequestBody PurchaseRequest request) {
		int user_id=3;
//		try {
//			Growing_TreeVO updateStock=Growing_TreeService.getAllStock(user_id);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return ResponseEntity.ok("성공");

	}
	 // DTO 클래스
    public static class PurchaseRequest {
        private int quantity;
        private int totalprice;

        // getter, setter
        public int getQuantity() { return quantity; }
        public void setQuantity(int quantity) { this.quantity = quantity; }
        public int getTotalprice() { return totalprice; }
        public void setTotalprice(int totalprice) { this.totalprice = totalprice; }
    }
}