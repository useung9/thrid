/**
 * 
 */
// 입금 확인 버튼 클릭
function confrimbtn(path,reserv_num){
<<<<<<< HEAD
	alert('확인되었습니다.');
=======
	alert('버튼클릭'+reserv_num);
>>>>>>> e84d1ba97357fb2bd1686a48a2c537e809f06b9a
	console.log('예약 번호 : '+reserv_num);
	

	document.getElementById('frmconfirm').method='post';
	document.getElementById('frmconfirm').action=path+'/room_management/room_confirm?reserv_num='+reserv_num;
	document.getElementById('frmconfirm').submit();
	
}

