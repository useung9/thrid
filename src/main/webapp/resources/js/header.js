//헤더

//document가 준비되었을 때
<<<<<<< HEAD

	//로그아웃을 클릭했을 때
function aLogout(e, path) {
	e.preventDefault();//기본이벤트 제거
	if (confirm('로그아웃하시겠습니까?')) {
		location.href = path +'/logout';

	}
}
	

	const sessionMember_id = $('#sessionMember_id').text().trim();

	if (sessionMember_id == '') {//로그인 전
		document.getElementById("aLogin").style.display = '';
		document.getElementById("aLogout").style.display = 'none';
		document.getElementById("aJoin").style.display = '';
	} else {//로그인 후
		document.getElementById("aLogin").style.display = 'none';
		document.getElementById("aLogout").style.display = '';
		document.getElementById("aJoin").style.display = 'none';
	}



=======
$(function(){
	const sessionMember_id = $('#sessionMember_id').text().trim();//텍스트로 읽어도 된다 trim은 공백체크

		if(sessionMember_id==''){//로그인 전
		$('#aLogin').show();
		$('#aLogout').hide();
		$('#aJoin').show();
	}else{//로그인 후
		$('#aLogin').hide();
		$('#aLogout').show();
		$('#aJoin').hide();
		
	}
	
		//로그아웃 버튼을 클릭했을때
	$('#aLogout').click((e)=>{
		e.preventDefault(); //기본이벤트 제거
		if (confirm('로그아웃하시겠습니까?')){
			alert("로그아웃 되었습니다")
			const path = $('#contextpath').val();
			location.href=`${path}/logout`	//path+/logout`;
			
		}		
	});
	
	
	
});
	//html 태그 사이값(태그까지 포함되어있을때)
	//val은 태그에 있는 값, 인풋 박스 내의 값들 
	//text 문자열로 취급할 때 
>>>>>>> e84d1ba97357fb2bd1686a48a2c537e809f06b9a

