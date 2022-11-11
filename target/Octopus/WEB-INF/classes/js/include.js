$(function () {
    $.get("discovery_header.html",function (data) {
        $("#disHead").html(data);
    });
    $.get("nav.html",function (data) {
        $("#nav").html(data);
    });
});