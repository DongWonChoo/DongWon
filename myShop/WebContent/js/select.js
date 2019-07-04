/**
 * 
 */
$(function(){
      $('#button_check').attr('disabled', true);
});
function check() {
	   var id_check = $("#pro_id").val().length;
	   if (id_check < 3) {
	      $("#check").text("3글자 이하입니다.");
	      $('#button_check').attr('disabled', true);
	   } else {
		  $("#check").text(" ");
	      $('#button_check').attr('disabled', false);
	   }
	}