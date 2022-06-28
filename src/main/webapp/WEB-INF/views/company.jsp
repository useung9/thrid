<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="./include/includeFile.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no">
<title>Insert title here</title>
<script type="text/javascript"
	src="https://openapi.map.naver.com/openapi/v3/maps.js?ncpClientId=xmyrulwcoh"></script>
<script>
		$(function () {
		//document가 ready후 실행
			//map id에 맵생성
			var map = new naver.maps.Map('map', {
<<<<<<< HEAD
			    center: new naver.maps.LatLng(33.42733659999988,126.44193849999989),//위도, 경도
			});
			//마커생성
			var marker = new naver.maps.Marker({
			    position: new naver.maps.LatLng(33.42733659999988,126.44193849999989),
=======
			    center: new naver.maps.LatLng(35.115219999999844, 129.04221359999963),//경도,위도 
			    zoom: 17
			});
			//마커생성
			var marker = new naver.maps.Marker({
			    position: new naver.maps.LatLng(35.115219999999844, 129.04221359999963),
>>>>>>> e84d1ba97357fb2bd1686a48a2c537e809f06b9a
			    map: map
			});
		});
			
	</script>
</head>
<body>
	<div class="container">
		<%@ include file="header.jsp"%>
		<div id="map" style="width: 100%; height: 400px;"></div>
	</div>

<<<<<<< HEAD
=======
	<!--부트스트랩-->
	<!-- Footer-->
	<footer class="py-5 bg-dark">
		<div class="container">
			<p class="m-0 text-center text-white">Copyright &copy; Your How
				about Geha</p>
		</div>
	</footer>
	<!-- Bootstrap core JS-->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
>>>>>>> e84d1ba97357fb2bd1686a48a2c537e809f06b9a



</body>
</html>