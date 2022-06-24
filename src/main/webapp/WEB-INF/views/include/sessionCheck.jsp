<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript">
//세션을 체크 (조회를 눌렀을때만 회원권한 체크, 인크루드로 빼서 리스트에 인크루드를 삽입했다.)
	if(!'${sessionScope.email}'){
		alert('로그인 후 사용하세요');
		location.href='/myapp/login';
	}
</script>