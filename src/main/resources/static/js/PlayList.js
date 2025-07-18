$(document).ready(() => {
    // 페이지 로딩 시 앨범 목록을 요청
    $.ajax({
        type: "POST",
        url: "/playListBox",
        dataType: "json", // 서버에서 JSON 형식의 데이터를 수신하도록 설정
        success: function (result) {
            // $("#playList").text(result);
            console.log(result)
            PlayList(result);
        },
        error: function (e) {
            console.log("플레이리스트 가져오기 실패", e);
            alert('플레이리스트 가져오기 실패');
        }
    });
});


function PlayList(result) {
    let output = "";
    for (let i in result) {
        output += `<a id="playlistInfoMove" onclick="goToPlaylist(${result[i].pinfoNum})"><div class="playList-container">
                        <div class="s-playlist">
                            <img src="/upload/${result[i].pinfoCoverName}">
                            <div class="s-playlist-info">
                                <div class="s-playlist-title">${result[i].pinfoTitle}</div>
                                <div style="display: flex;">
                                    <div class="s-playlist-subtitle">${result[i].pinfoDate.split('T')[0]}</div>    
                                    <div class="s-playlist-subtitle" style="margin-left: 10px;">❤ ${result[i].pinfoHit}</div>
                                </div>
                           </div>
                    </div></a>`;
    }
    $("#playList").html(output);
}

// 페이지 이동 함수 정의
function goToPlaylist(pinfoNum) {
    window.location.href = `/goToPlaylist/${pinfoNum}`;
}
