
function m(){
var a = document.getElementById("mes").value;
var date = new Date(a);
var fecha = date.getMonth();
       if (fecha == 11){
document.getElementById("29").style.visibility = "visible";
document.getElementById("30").style.visibility = "visible";
document.getElementById("31").style.visibility = "visible";
       }
       if(fecha==0){
document.getElementById("29").style.visibility = "collapse";
document.getElementById("30").style.visibility = "collapse";
document.getElementById("31").style.visibility = "collapse";
       }
       
       if(fecha==1){
document.getElementById("29").style.visibility = "visible";
document.getElementById("30").style.visibility = "visible";
document.getElementById("31").style.visibility = "visible";
       }
       
       if(fecha==2){
document.getElementById("29").style.visibility = "visible";
document.getElementById("30").style.visibility = "visible";
document.getElementById("31").style.visibility = "collapse";
       }
       
       if(fecha==3){
document.getElementById("29").style.visibility = "visible";
document.getElementById("30").style.visibility = "visible";
document.getElementById("31").style.visibility = "visible";
       }
       
       if(fecha==4){
document.getElementById("29").style.visibility = "visible";
document.getElementById("30").style.visibility = "visible";
document.getElementById("31").style.visibility = "collapse";
       }
       
       if(fecha==5){
document.getElementById("29").style.visibility = "visible";
document.getElementById("30").style.visibility = "visible";
document.getElementById("31").style.visibility = "visible";
       }
       
       if(fecha==6){
document.getElementById("29").style.visibility = "visible";
document.getElementById("30").style.visibility = "visible";
document.getElementById("31").style.visibility = "visible";
       }
       
       if(fecha==7){
document.getElementById("29").style.visibility = "visible";
document.getElementById("30").style.visibility = "visible";
document.getElementById("31").style.visibility = "collapse";
       }
       
       if(fecha==8){
document.getElementById("29").style.visibility = "visible";
document.getElementById("30").style.visibility = "visible";
document.getElementById("31").style.visibility = "visible";
       }
       
       if(fecha==9){
document.getElementById("29").style.visibility = "visible";
document.getElementById("30").style.visibility = "visible";
document.getElementById("31").style.visibility = "collapse";
       }
       
       if(fecha==10){
document.getElementById("29").style.visibility = "visible";
document.getElementById("30").style.visibility = "visible";
document.getElementById("31").style.visibility = "visible";
       }
   }
   
   function d1(){
       document.getElementById("diaR").value="1";
   }
   function d2(){
       document.getElementById("diaR").value="2";
   }
   function d3(){
       document.getElementById("diaR").value="3";
   }
   function d4(){
       document.getElementById("diaR").value="4";
   }
   function d5(){
       document.getElementById("diaR").value="5";
   }
   function d6(){
       document.getElementById("diaR").value="6";
   }
   function d7(){
       document.getElementById("diaR").value="7";
   }