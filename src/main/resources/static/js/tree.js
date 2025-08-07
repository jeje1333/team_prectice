const modal = document.getElementById("popupModal"); // 팝업창
const buyBtn = document.getElementById("buy"); // 비료 구매 버튼
const closeBtn = document.querySelector(".close"); // 닫기 버튼
const purchase = document.getElementById("purchase"); //팝업창에서 비료 구매 버튼
const biyro_stock = document.getElementById("biyro_stock"); //비료 재고 조회(1/2)
const biyro_stockm = document.getElementById("biyro_stockm"); //비료 재고 조회(2/2)
const point = document.getElementById("point"); //사용자가 보유한 포인트 버튼
const soo = document.getElementById("soo"); //현재 개수
const minus = document.getElementById("minus"); //개수 감소 버튼
const plus = document.getElementById("plus"); //개수 증가 버튼
const price = document.getElementById("price"); // 가격(구매가격)

let sales = 500;
let gaesoo = 1;

buyBtn.onclick = () => {
	modal.style.display = "block";
};

if (closeBtn) {
	closeBtn.onclick = () => {
		modal.style.display = "none";
	};
}

window.onclick = (e) => {
	if (e.target === modal) modal.style.display = "none";
};

purchase.onclick = () => {
	const point2 = parseInt(point.textContent);
	const biyro2 = parseInt(biyro_stock.textContent);
	const price2 = parseInt(price.textContent);

	if (point2 >= price2) {
		fetch('/purchase', {
			method: 'POST',
			headers: {
				'Content-Type': 'application/json',
				'Accept': 'application/json'
			},
			body: JSON.stringify({ quantity: gaesoo, totalprice: price2 })
		})
		.then(response => response.json())
		.then(data => {
			biyro_stock.textContent = biyro2 + gaesoo;
			biyro_stockm.textContent = biyro2 + gaesoo;
			point.textContent = point2 - price2;
			alert("구매 성공하였습니다.");
			gaesoo = 1;
			price.textContent = sales;
			soo.textContent = gaesoo;
		})
		.catch(error => {
			console.error("구매 중 오류 발생:", error);
			alert("서버 오류로 구매에 실패했습니다.");
		});
	} else {
		alert("포인트가 부족합니다.");
		gaesoo = 1;
		price.textContent = sales;
		soo.textContent = gaesoo;
	}
};

minus.onclick = () => {
	if (gaesoo > 1) {
		gaesoo--;
		soo.textContent = gaesoo;
		price.textContent = sales * gaesoo;
	} else {
		alert("최소 한 개는 선택하셔야 합니다.");
	}
};

plus.onclick = () => {
	gaesoo++;
	soo.textContent = gaesoo;
	price.textContent = sales * gaesoo;
};
