<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/includeFile.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>Heroic Features - Start Bootstrap Template</title>
<!-- Bootstrap icons-->
<link rel="icon" type="image/x-icon"
	href="${path}/resources/image/favicon.ico" />
<!-- Core theme CSS (includes Bootstrap)-->
<link href="${path}/resources/css/reservstyles.css" rel="stylesheet" />

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript"
	src="${path}/resources/js/reservation/userreservation.js">
	
</script>

<body>
	
<<<<<<< HEAD
=======
	<!-- Responsive navbar-->
	<!-- <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container">
			<a class="navbar-brand" href="#!">Start Bootstrap</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav ms-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link" href="#">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="#!">About</a></li>
					<li class="nav-item"><a class="nav-link" href="#!">Contact</a></li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">Blog</a></li>
				</ul>
			</div>
		</div>
	</nav> -->
>>>>>>> e84d1ba97357fb2bd1686a48a2c537e809f06b9a
	<%@ include file="../header.jsp" %>
	<!-- Sidebar-->
	<div class="d-inline-flex" id="wrapper">
		<div class="room_gall" id="sidebar-wrapper">
			<%@ include file="../sidebar.jsp"%>
		</div>


	




		<%-- ${rlist} --%>
		<div class="modi" align="center">
		<div>	
		<h3 align="center">??? ???????????? ?????????</h3>
		</div>
<<<<<<< HEAD
			<c:if test="${not empty rlist}">
				<form id="frm_reserv" action = "${path}/reservation/usereservation" method="post">
=======
			<c:if test="${not empty mlist}">
				<form action = "${path}/Reservation/userreservation" method="post">
>>>>>>> e84d1ba97357fb2bd1686a48a2c537e809f06b9a
					<table class="statustb">
						<thead>
							<tr>
								<th>??????</th>
								<th>????????????</th>
								<th>????????????</th>
								<th>????????? / ??????</th>
								<th>?????????</th>
	
							</tr>
						</thead>
						<tbody>
							<c:forEach var="list" items="${rlist}">
								<tr>
									<td>
										<input type="checkbox" id="box" name="box" value="${list.RESERVATION_IDX}">
									</td>
									<td>
<<<<<<< HEAD
										<a id="modify_reservation" href="${path}/reservation/updatereservation?idx=${list.RESERVATION_IDX}">${list.RESERVATION_IDX}</a>
=======
										<a id="modify_reservation" href="${path}/Reservation/updatereservation?idx=${list.RESERVATION_IDX}">${list.RESERVATION_IDX}</a>
>>>>>>> e84d1ba97357fb2bd1686a48a2c537e809f06b9a
									</td>
									<td>
									<!-- ???????????? -->
										
											<c:if test="${list.RE_STATUS eq 'y'}">
												<button type="button" onclick="return false;" class="statusbtn">?????? ??????</button>
											</c:if>
											<!-- ????????? -->
											<c:if test="${list.RE_STATUS ne 'y'}">
												<h3 style="color: green;">????????? ?????????</h3>
											</c:if>
									
									</td>
									<td>
										${list.RE_STARTDATE}<br>${list.RE_ENDDATE}
									</td>
									<td>
										${list.ROOM_NAME}
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
					<br>
					<%-- <button class="btnclick" onclick="btnclick('${path}','<%=sessionv%>')">?????? ??????</button> --%>
					<button class="btnclick" onclick="btnclick('${path}', event)">?????? ??????</button>
				</form>
			</c:if>
<<<<<<< HEAD
			<c:if test="${empty rlist}">
				<div align="center" style="font-size: 12px">????????? ????????? ????????????.</div>
			</c:if>
		</div>
=======
			<c:if test="${empty mlist}">
				<div align="center" style="font-size: 12px">????????? ????????? ????????????.</div>
			</c:if>
		</div>

>>>>>>> e84d1ba97357fb2bd1686a48a2c537e809f06b9a
	</div>
</body>
</html>