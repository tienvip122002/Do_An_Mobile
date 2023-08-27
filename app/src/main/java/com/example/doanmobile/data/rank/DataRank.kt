package com.example.doanmobile.data.rank

import com.example.doanmobile.R

object DataRank {
    val ranking =
        Rank(
            id = "1",
            title = "One Piece",
            category = "Phiêu lưu/ Hành động",
            age = 14,
            description = "Luffy và phi hành đoàn đi đến hòn đảo Asuka để tìm kiếm một than" +
                    "h kiếm huyền thoại đắt giá nhất hành tinh mặc dù nó chứa một lời nguyền chết người và" +
                    " một kho báu giá trị. Khi trở lại, cả nhóm phát hiện ra Zoro – " +
                    "người được giao nhiệm vụ trông tàu đã mất tích và bất ngờ bị lính thủy tấn công. ",
            puppyImageId = R.drawable.filmnew1
        )
    val rankingList = listOf(
        ranking,
        Rank(
            id = "2",
            title = "Naruto",
            category = "Hành động/ Kịch tính",
            age = 14,
            description = "Câu chuyện mở đầu với trận chiến tại một bờ biển hoang vắng vào ban đêm " +
                    "giữa ninja làng Cát và những tên khổng lồ mặc chiếc áo giáp nâu. Những ninja làng" +
                    " Cát đang hoàn toàn bị thất thế trước những tên to lớn này. Đúng lúc đó Gaara và Kankuro" +
                    " xuất hiện để bảo vệ họ. Do lá chắn cát của Gaara quá mạnh nên những tên to lớn kia buộc phải " +
                    "rút lui. Họ nhìn thấy những tên ấy chạy ra một con tàu chiến giữa biển. 2 ninja quyết chèo thuyền" +
                    " ra để tìm hiểu rõ về con tàu ấy, mặc cho người khác khuyên ngăn, khi bóng họ và tàu khuất dần," +
                    " tất cả chỉ nghe thấy tiếng kêu thất thanh và không thấy họ quay lại nữa. ",
            puppyImageId = R.drawable.filmnew2
        ),
        Rank(
            id = "3",
            title = "Sword art Online",
            category = "Game/ Hành động",
            age = 14,
            description = "Con đường sống duy nhất là đánh bại mọi kẻ thù. Cái chết trong game đồng nghĩa với cái chết ngoài " +
                    "đời thực---- Bằng Nerve Gear, mười ngàn con người lao đầu vào một trò chơi bí ẩn 'Sword Art Online'," +
                    " để rồi bị giam cầm trong đó, buộc phải dấn thân vào một đấu trường sinh tử. ",
            puppyImageId = R.drawable.filmnew2
        ),
        Rank(
            id = "4",
            title = "Slime datta ken",
            category = "Huyền ảo/ Hư cấu",
            age = 14,
            description = "Câu chuyện sẽ xoay quanh Razha, một quốc gia nằm ở phía Tây. Rimuru sẽ thấy mình" +
                    " bị cuốn vào một âm mưu xung quanh nữ hoàng." +
                    " Người ta nói rằng cô ấy sở hữu sức mạnh vô danh.  ",
            puppyImageId = R.drawable.filmnew2
        ),
        Rank(
            id = "5",
            title = "Bleach",
            category = "Hành động/ Giả tưởng/ Phiêu lưu",
            age = 14,
            description = "Ichigo Kurosaki là một thiếu niên hung hăng, hay gây rắc rối và cậu có được" +
                    " một năng lực đặc bệt là có thể nhìn thấy linh hồn. Câu chuyện bắt đầu với sự " +
                    "xuất hiện bất ngờ của một người lạ ngay trong phòng ngủ của Ichigo. ",
            puppyImageId = R.drawable.filmnew2
        )
    )
}