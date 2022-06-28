//회원가입 js

<<<<<<< HEAD
//로그인 버튼을 클릭했을 때
=======

>>>>>>> e84d1ba97357fb2bd1686a48a2c537e809f06b9a
function joinCheck(e){
	e.preventDefault(); //기본
	const username = document.getElementById('username');
	const email = document.getElementById('email');
<<<<<<< HEAD
	const chkEmail = document.getElementById('chkEmail');
=======
>>>>>>> e84d1ba97357fb2bd1686a48a2c537e809f06b9a
	const passwd = document.getElementById('passwd');
	const passwdConfirm = document.getElementById('passwdConfirm');
	const phone = document.getElementById('phone');
	console.log(username.value);
	console.log(email.value);
	console.log(passwd.value);
	console.log(passwdConfirm.value);
	console.log(phone.value);
	if (!username.value){
		alert('이름을 입력해주세요');
		username.focus();
		return ;
	}
	if (!email.value){
		alert('이메일을 입력해주세요');
		email.focus();
		return ;
	}
	if (!passwd.value){
		alert('비밀번호를 입력해주세요');
		passwd.focus();
		return ;
	}
	if (!passwdConfirm.value){
		alert('비밀번호 확인을 입력해주세요');
		passwdConfirm.focus();
		return ;
	}
	if (!phone.value){
		alert('핸드폰 번호를 입력해주세요');
		phone.focus();
		return ;
	}
	if (passwd.value !== passwdConfirm.value){
		alert('비밀번호가 일치하지 않습니다');
		passwdConfirm.focus();
		return ;
	}
<<<<<<< HEAD

	if (!chkEmail.checked){
		alert('이메일 체크를 진행해 주세요');
		return ;
	}
	
	
=======
>>>>>>> e84d1ba97357fb2bd1686a48a2c537e809f06b9a
	
	document.getElementById('frmJoin').submit();
	
	
<<<<<<< HEAD
}	

//이메일 중복버튼을 클릭했을 때 
function emailCheck(e, path){
	const email = document.getElementById('email').value;
	console.log(email);
	if(!email){
		alert('이메일을 작성해 주세요');
		document.getElementById('email').focus();
		return;
	}
	
	//ajax를 이용해서 비동기 방식
	fetch(`${path}/member/emailCheck/${email}`)
	.then(res=>res.json())
	.then(data=>{
		console.log(data.code);
		console.log(data.msg);
		alert(data.msg)
		if (data.code === 0)
			document.getElementById('chkEmail').checked = true;
		else
			document.getElementById('chkEmail').checked = false;
	})
	.catch(console.error);
}
=======
	
	
	
	
	
}	
>>>>>>> e84d1ba97357fb2bd1686a48a2c537e809f06b9a
