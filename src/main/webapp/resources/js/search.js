//after search

// document.getElementById('search_form').onsubmit = function(e){
//     alert("wow");
//     document.activeElement.blur();
// }

$("#searchkey").on('keypress', function(e){
    var keycode = e.keycode;

    console.log(e)
    var searched_name = $(this).val();
    alert("test");
    if(keycode == '13'){
        e.preventDefault();
        alert(searched_name);
        document.activeElement.blur();
    }
});
