// 检查搜索内容
document.getElementById('search_form').onsubmit = function(e) {
    var search_input_btn = document.getElementById("searchkey");
    var search_input = $("#searchkey").val();
    search_input = search_input.trim();
    // if users enters nothing or blank space, disable jump and feedback
    if (search_input.length == 0) {
      e.preventDefault();
      search_input_btn.setAttribute("placeholder", "请输入内容");
    } else {
      document.activeElement.blur();
    }
  }

// 滑动监听
var startY,endY;
document.addEventListener('touchstart',function(e){
    startY= e.touches[0].pageY;
},false);
document.addEventListener('touchend',function(e){
    endY= e.changedTouches[0].pageY;
    moveLoad();
},false);
function moveLoad(){
    var movY=endY-startY;
    if(movY<-80){
        this.hide();
    }else{
        this.show();
    }
}

  