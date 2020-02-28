//触发file控件的事件
  function fileSelect() {
    $timeout(function () {
        $("#file").click();
    });

};

//显示选择的文件名
updateFileName = function (e) {
    var fullPath = e.value;
    var startIndex = fullPath.lastIndexOf("\\") + 1;
    var fileName = fullPath.slice(startIndex - fullPath.length);
    $("#selectFileName").text(fileName);
};