/**
 * 
 */



/* function a(){
	 var xhttp = new XMLHttpRequest();
	 xhttp.open("GET", "/Plz_Windows/shop.do");
	 xhttp.onreadystatechange = function() {
	   if (xhttp.readyState == 4 && xhttp.status == 200) {
	     document.getElementById("Context").innerHTML = xhttp.responseText;
	   }
	 };
	 xhttp.send();
 }*/
 
 function a(){
     $.ajax({
    	 url: "/Plz_Windows/shop.do",
         type: "GET",
         dataType: "text",
         success:
         function(data){
        	 $('#Context').html(data);
         },
         error:
         function (request, status, error){
         alert("ajax실패");
         }
     });
   }
	 
	 
 function b(){
	 var xhttp = new XMLHttpRequest();
	 xhttp.open("GET", "ngame.jsp");
	 xhttp.onreadystatechange = function() {
	   if (xhttp.readyState == 4 && xhttp.status == 200) {
	     document.getElementById("Context").innerHTML = xhttp.responseText;
	   }
	 };
	 xhttp.send();
 }
 function c(){
	 var xhttp = new XMLHttpRequest();
	 xhttp.open("GET", "event.jsp");
	 xhttp.onreadystatechange = function() {
	   if (xhttp.readyState == 4 && xhttp.status == 200) {
	     document.getElementById("Context").innerHTML = xhttp.responseText;
	   }
	 };
	 xhttp.send();
 }
 
 
 function sub(){
	 var xhttp = new XMLHttpRequest();
	 xhttp.open("GET", "MainShopSub.jsp");
	 xhttp.onreadystatechange = function() {
	   if (xhttp.readyState == 4 && xhttp.status == 200) {
	     document.getElementById("Context").innerHTML = xhttp.responseText;
	   }
	 };
	 xhttp.send();
 }
 
 function All_copy(){
	 var xhttp = new XMLHttpRequest();
	 xhttp.open("GET", "assets/copy.jsp");
	 xhttp.onreadystatechange = function() {
	   if (xhttp.readyState == 4 && xhttp.status == 200) {
	     document.getElementById("copyright").innerHTML = xhttp.responseText;
	   }
	 };
	 xhttp.send();
 }
 
 
 function mainShop(){
     $.ajax({
       type : "GET",
       url : "MainShop.jsp",
       dataType : "text",
       error : function() {
         alert('통신실패!!');
       },
       success : function(data) {
         $('#wrapper').html(data);
       }

     });
   }
 
 function freeBoard(){
     $.ajax({
       type : "GET",
       url : "FreeBoard.jsp",
       dataType : "text",
       error : function() {
         alert('통신실패!!');
       },
       success : function(data) {
         $('#wrapper').html(data);
       }

     });
   }
 
 function notice(){
     $.ajax({
       type : "GET",
       url : "Notice.jsp",
       dataType : "text",
       error : function() {
         alert('통신실패!!');
       },
       success : function(data) {
         $('#wrapper').html(data);
       }

     });
   }
/*
 $(document).ready(function(){
		a();
	})
*/
