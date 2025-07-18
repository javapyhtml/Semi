function musicList(result) {
    let output = "";
    for (let i in result) {
        output += `<div class="chartBox">
                        <div class="rank">
                            <span>${parseInt(i) + 1}</span>
                        </div>
                        <div class="album-cover">
                            <img src="${result[i].malbumCoverName}" width="60" height="60">
                        </div>
                        <div class="song-info">
                            <span class="musicInfo" data-mid-id="${result[i].mid}"><p class="title">${result[i].mtitle}</p></span>
                            <span class="artistInfo" data-artist-id="${result[i].artistId}"><p class="artist">${result[i].artistName}</p></span>
                        </div>
                        <div class="album">
                            <p>${result[i].malbum}</p>
                        </div>
                       <div class="likes">
                                <p class="like-count" data-mtitle="${result[i].mtitle}">❤ ${result[i].mlike}</p>
                        </div>
                        <div class="actions">
                            <button class="playBtn" data-song-title="${result[i].mtitle}" data-artist-name="${result[i].artistName}" data-album-cover="${result[i].malbumCoverName}" >▶</button>
                            <button id="plusPy">+</button>
                            <button>↓</button>
                        </div>
                    </div>`;
    }
    $("#test").html(output);
}



    // 좋아요 <p> 태그 클릭 이벤트 추가
    $('.like-count').click(function () {

        const mtitle = $(this).data('mtitle');
        console.log(mtitle);
        $.ajax({
            type: 'POST',
            url: '/increaseMHit',
            data: {mtitle: mtitle},
            success: function () {
                alert('좋아요가 반영되었습니다!');
                // 증가된 히트를 반영하여 UI를 업데이트합니다.
                let currentCount = parseInt($(this).text().replace('❤', '').trim());
                $(this).text(`❤ ${currentCount + 1}`);
                window.location.href = window.location.href;
            },
            error: function (error) {
                console.log('좋아요 반영 실패', error);
                alert('이미 좋아요를 누르셨습니다!');
            }
        });
    });
