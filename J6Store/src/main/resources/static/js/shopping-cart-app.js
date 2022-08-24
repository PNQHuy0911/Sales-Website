const app = angular.module("shopping-cart-app",[]);
app.controller("shopping-cart-ctrl",function($scope,$http){
	$scope.cart={
		items:[],
		//Thêm sản phẩm vào giỏ
			add(id) {
		var item = this.items.find(item => item.id == id);
		if(item){
			item.qty++;
			this.saveToLocalStorage();
		}
		else{
			$http.get(`/rest/products/${id}`).then(resp => {resp.data.qty = 1;
			this.items.push(resp.data);
			this.saveToLocalStorage();
			})
		}
		},
		//Tính tổng mặt hàng trong giỏ
		get count() {
			return this.items
				.map(item => item.qty)
				.reduce((total, qty) => total += qty, 0);
		},
		//Xóa sản phẩm trong giỏ
		remove(id) {
			var index = this.items.findIndex(item => item.id == id);
			this.items.splice(index, 1);
			this.saveToLocalStorage();

		},
		//Xóa sạch giỏ
		clear() {
			this.items = [];

			this.saveToLocalStorage();

		},
		//Tính tổng số tiền trong giỏ
		get amount() {
			return this.items
				.map(item => item.qty * item.price)
				.reduce((total, qty) => total += qty, 0);
		},
		//Lưu giỏ hàng
		saveToLocalStorage() {
			var json = JSON.stringify(angular.copy(this.items));
			localStorage.setItem("cart", json);
		},
		//Đọc giỏ hàng từ local 
		loadFromLocalStorage() {
			var json = localStorage.getItem("cart");
			this.items = json ? JSON.parse(json) : [];
		}
		
		
	}
		$scope.cart.loadFromLocalStorage();
})
