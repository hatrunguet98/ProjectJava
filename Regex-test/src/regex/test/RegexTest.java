/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Ha Trung
 */
public class RegexTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String text="<div id=\"divNewsContent\" class=\"fon34 mt3 mr2 fon43 detail-content\">\n" +
"    <div class=\"VCSortableInPreviewMode\" type=\"VideoStream\" embed-type=\"4\" data-width=\"600px\" data-height=\"400px\"\n" +
"         data-vid=\"dantri/2019/1/14/vien-k-tan-trieu-1547453942379381201736-5cfd5.mp4\"\n" +
"         data-info=\"5ed856e017d511e983d673b73a239a5c\" data-autoplay=\"false\" data-removedlogo=\"false\" data-location=\"\"\n" +
"         data-displaymode=\"0\"\n" +
"         data-thumb=\"https://video-thumbs.mediacdn.vn/dantri/2019/1/14/vien-k-tan-trieu-1547453942379381201736-5cfd5.jpg\"\n" +
"         data-contentid=\"\" data-namespace=\"dantri\" data-originalid=\"\">\n" +
"        <div class=\"VideoCMS_Caption\">\n" +
"            <p class=\"\" data-placeholder=\"[nhập chú thích]\" style=\"text-align: center;\">Chủ nhân giải nhất Nhân tài đất\n" +
"                Việt trao 200 triệu tiền giải thưởng cho bệnh nhân, người nghèo</p></div>\n" +
"    </div>\n" +
"    <p>Ông Phạm Huy Hoàn, Tổng biên tập báo Dân trí, Trưởng Ban tổ chức Giải thưởng Nhân tài đất Việt 2018 đã trao giấy\n" +
"        chứng nhận và giải thưởng trị giá 200 triệu đồng cho nhóm tác giả đề tài các “Cụm công trình nghiên cứu Dịch tễ\n" +
"        học, ứng dụng các tiến bộ mới trong chẩn đoán, điều trị và nâng cao chất lượng sống cho người bệnh ung thư\n" +
"        vú”.</p>\n" +
"    <div class=\"VCSortableInPreviewMode IMSCurrentEditorEditObject\" type=\"Photo\" style=\"\">\n" +
"        <div><img\n" +
"                alt=\"Chủ nhân giải nhất Nhân tài Đất Việt trao 200 triệu tiền giải thưởng cho bệnh nhân, người nghèo - Ảnh 2.\"\n" +
"                extid=\"3766a120-17d0-11e9-a5d1-55fd2bd4044d\" id=\"img_405992\" photoid=\"405992\" rel=\"lightbox\"\n" +
"                src=\"https://dantricdn.com/2019/1/14/giaithuong-1547451855712157302023.jpg\" style=\"max-width:100%;\"\n" +
"                title=\"Chủ nhân giải nhất Nhân tài Đất Việt trao 200 triệu tiền giải thưởng cho bệnh nhân, người nghèo - Ảnh 2.\"\n" +
"                type=\"photo\" data-original=\"https://dantricdn.com/2019/1/14/giaithuong-1547451855712157302023.jpg\"\n" +
"                width=\"\" height=\"\"></div>\n" +
"        <div class=\"PhotoCMS_Caption\"><p data-placeholder=\"[nhập chú thích]\">GS.TS Trần Văn Thuấn, Giám đốc Bệnh viện K\n" +
"            cùng đại diện nhóm nghiên cứu nhận chứng nhận giải thưởng Nhân tài đất Việt lĩnh vực Y Dược 2018. Ảnh:\n" +
"            H.Hải</p></div>\n" +
"    </div>\n" +
"    <p>Tổng biên tập báo Dân trí cho biết, Giải thưởng Nhân tài đất Việt đã trải qua 14 mùa giải, trong đó, giải thưởng\n" +
"        về lĩnh vực Y Dược được tổ chức từ năm 2010 đến nay. Nhóm tác giả gồm GS.TS Trần Văn Thuấn cùng các cộng sự là\n" +
"        giải thưởng lần thứ 9 được trao trong lĩnh vực Y Dược.</p>\n" +
"    <div class=\"VCSortableInPreviewMode\" type=\"Photo\" style=\"\">\n" +
"        <div><img\n" +
"                alt=\"Chủ nhân giải nhất Nhân tài Đất Việt trao 200 triệu tiền giải thưởng cho bệnh nhân, người nghèo - Ảnh 3.\"\n" +
"                extid=\"8a5d7d90-17d0-11e9-823c-c76bbf6fda39\" id=\"img_405993\" photoid=\"405993\" rel=\"lightbox\"\n" +
"                src=\"https://dantricdn.com/2019/1/14/nhantaidatviet1-1547451876558796564008.jpg\" style=\"max-width:100%;\"\n" +
"                title=\"Chủ nhân giải nhất Nhân tài Đất Việt trao 200 triệu tiền giải thưởng cho bệnh nhân, người nghèo - Ảnh 3.\"\n" +
"                type=\"photo\" data-original=\"https://dantricdn.com/2019/1/14/nhantaidatviet1-1547451876558796564008.jpg\"\n" +
"                width=\"\" height=\"\"></div>\n" +
"        <div class=\"PhotoCMS_Caption\"><p data-placeholder=\"[nhập chú thích]\">Tổng biên tập báo Dân trí, Trưởng ban Tổ\n" +
"            chức Giải thưởng Nhân tài đất Việt 2018 đánh giá cao hiệu quả công trình nghiên cứu. Ảnh: Hữu Nghị.</p>\n" +
"        </div>\n" +
"    </div>\n" +
"    <p>Ông Phạm Huy Hoàn đánh giá \"Cụm công trình nghiên cứu Dịch tễ học, ứng dụng các tiến bộ mới trong chẩn đoán, điều\n" +
"        trị và nâng cao chất lượng sống cho người bệnh ung thư vú” là một đề tài mang tính thực tiễn cao, nâng tỉ lệ\n" +
"        chữa khỏi ung thư vú lên đến 95% nếu bệnh nhân được chẩn đoán giai đoạn sớm. Kết quả cũng đã được ứng dụng rộng\n" +
"        rãi trong mạng lưới các bệnh viện ung bướu trong cả nước.</p>\n" +
"    <p>GS.TS Trần Văn Thuấn cho biết, đây là cụm công trình được các các bộ nòng cốt bệnh viện K tiến hành từ năm 1993\n" +
"        đến nay. Hiện nay, phác đồ điều trị này không những áp dụng tại Việt Nam mà nhiều nước trên thế giới cũng áp\n" +
"        dụng phác đồ này.</p>\n" +
"    <p>\"Cụm công trình được tiến hành trong suốt 25 năm, nó không chỉ nổi trội về nghiên cứu, hợp tác quốc tế, mà cụm\n" +
"        công trình bao gồm tất cả các lĩnh vực từ dịch tễ, chẩn đoán, sinh học phân tử, mảng điều trị ngoại khoa, nội\n" +
"        khoa, xạ trị…liên quan đến ung thư phú.&nbsp;</p>\n" +
"    <p>Tại Việt Nam, ung thư vú là bệnh phổ biến nhất ở phụ nữ và ngày càng tăng cao, việc ứng dụng những kỹ thuật mới\n" +
"        trong cụm công trình đã nâng cao tỉ lệ điều trị khỏi cho bệnh nhân ung thư vú lên đến 95% nếu phát hiện sớm. Tỉ\n" +
"        lệ chữa khỏi ung thư vú ở viện K nói chung cho tất cả các giai đoạn tới 75%, tương đương các nước phát triển\",\n" +
"        GS Thuấn nói.</p>\n" +
"    <p>Thay mặt nhóm nghiên cứu, ông cũng bày tỏ công trình nghiên cứu với kết quả điều trị khỏi bệnh ung thư vú rất\n" +
"        ngoạn mục, là niềm tự hào không riêng của bệnh viện K mà cho ngành ung thư, cho ngành y tế. GS Thuấn cũng bày tỏ\n" +
"        lời cảm ơn tới tất cả các thầy, cô, đồng nghiệp đã không quản ngại khó khăn nghiên cứu, đánh giá, tổng kết, phổ\n" +
"        biến, chuyển giao kỹ thuật điều trị ung thư vú cho tuyến tỉnh.</p>\n" +
"    <p>Với số tiền thưởng trị giá 200 triệu đồng, GS Thuấn cũng thay mặt nhóm tác giả trao tặng 100 triệu đồng cho Quỹ\n" +
"        Ngày mai tươi sáng, 100 triệu đồng dành tặng Quỹ Nhân ái của Báo Dân trí để dành tặng các trường hợp khó\n" +
"        khăn.</p>\n" +
"    <p>Ths Nguyễn Đình Anh, Vụ trưởng Vụ Thi đua khen thưởng (Bộ Y tế) đánh giá cụm công trình là thành quả, là công lao\n" +
"        đóng góp của nhiều cá nhân với sự nghiệp phòng chống ung thư, trong đó có ung thư vú. \"Đây là vinh dự không\n" +
"        riêng của bệnh viện K mà là của toàn ngành y tế, khi mà mỗi năm có 1 - 2 cụm công trình y tế được nhận giải\n" +
"        thưởng\".</p>\n" +
"    <p>\"Tỉ lệ chữa khỏi ung thư vú nếu phát hiện sớm là 95%, điều trị khỏi tất cả các giai đoạn là 75%. Đây là kết quả\n" +
"        ngoạn mục khi mà điều kiện của Việt Nam chưa bằng các nước phát triển, nhưng tỉ lệ điều trị khỏi bệnh là tương\n" +
"        đương\", ông Đình Anh cho biết.</p>\n" +
"    <p>Đề tài “Cụm công trình nghiên cứu Dịch tễ học, ứng dụng các tiến bộ mới trong chẩn đoán, điều trị và nâng cao\n" +
"        chất lượng sống cho người bệnh ung thư vú” do GS.TS Trần Văn Thuấn, GS.TS Nguyễn Bá Đức, PGS.TS Bùi Diệu, PGS.TS\n" +
"        Tạ Văn Tờ, TS Nguyễn Văn Định, TS Lê Thanh Đức, TS Lê Hồng Quang, TS Phùng Thị Huyền, TS Đỗ Doãn Thuận, BS Đặng\n" +
"        Thế Căn, BS Tô Anh Dũng, PGS.TS Trần Thanh Hương, Ths Nguyễn Hoài Nga và cộng sự thực hiện được trao giải nhất\n" +
"        lĩnh vực Y Dược Nhân tài đất Việt năm 2018.</p>\n" +
"    <div class=\"VCSortableInPreviewMode\" type=\"Photo\" style=\"\">\n" +
"        <div><img\n" +
"                alt=\"Chủ nhân giải nhất Nhân tài Đất Việt trao 200 triệu tiền giải thưởng cho bệnh nhân, người nghèo - Ảnh 4.\"\n" +
"                extid=\"828dd380-17d0-11e9-b94b-65ea4343f75d\" id=\"img_405994\" photoid=\"405994\" rel=\"lightbox\"\n" +
"                src=\"https://dantricdn.com/2019/1/14/nhantaidatviet-154745198448313390647.jpg\" style=\"max-width:100%;\"\n" +
"                title=\"Chủ nhân giải nhất Nhân tài Đất Việt trao 200 triệu tiền giải thưởng cho bệnh nhân, người nghèo - Ảnh 4.\"\n" +
"                type=\"photo\" data-original=\"https://dantricdn.com/2019/1/14/nhantaidatviet-154745198448313390647.jpg\"\n" +
"                width=\"\" height=\"\"></div>\n" +
"        <div class=\"PhotoCMS_Caption\"><p data-placeholder=\"[nhập chú thích]\">GS.TS Trần Văn Thuấn (đứng giữa) nhận giải\n" +
"            nhất Nhân tài đất Việt 2018 lĩnh vực Y Dược.</p></div>\n" +
"    </div>\n" +
"    <p>Tại Việt Nam, ung thư vú là loại ung thư phổ biến hàng đầu ở nữ giới với tỷ lệ mắc mới chuẩn hóa theo tuổi (ASR)\n" +
"        vào năm 2013 là 24,4/100.000 dân (ước tính của GLOBOCAN năm 2018 là 26,4/100.000 dân).</p>\n" +
"    <p>Theo thống kê, hiện có khoảng 42.188 người đang sống cùng căn bệnh ung thư vú. Trước đây ung thư vú là nỗi ám ảnh\n" +
"        của nhiều người, nhưng ngày nay ung thư vú có thể sàng lọc, phát hiện sớm và tiên lượng điều trị tốt nếu được\n" +
"        chẩn đoán ở giai đoạn sớm.</p>\n" +
"    <p>Như với kỹ thuật FISH – phương pháp lai tại chỗ gắn huỳnh quang, tỷ lệ bộc lộ HER2 lên đến 41%, và tỷ lệ khuyếch\n" +
"        đại gen chiếm 39%, là dấu ấn quan trọng cho việc ứng dụng liệu pháp điều trị đích bằng kháng thể đơn dòng\n" +
"        Trastuzumab, qua đó cải thiện ngoạn mục về tỷ lệ sống thêm cho bệnh nhân ung thư vú có thụ thể HER2 dương tính,\n" +
"        cụ thể tỷ lệ sống thêm toàn bộ sau 1-3 năm là 87- 98%, kể cả ở các nhóm có di căn hạch tỷ lệ sống không bệnh sau\n" +
"        5 năm là trên 75%.</p>\n" +
"    <p>\"Nếu bình thường không có biện pháp điều trị đích, không có phương pháp chẩn đoán gen, tỉ lệ sống thêm của người\n" +
"        bệnh có gen dương tính dưới 50%. Nhưng nay, nhờ các kĩ thuật mới này đã \"lội ngược dòng\" một cách ngoạn mục, với\n" +
"        tỉ lệ chữa khỏi ung thư vú tại BV K là 75%, tương đương như tại Singapore\", GS Thuấn nói.</p>\n" +
"    <p>GS Thuấn cho biết, với ung thư vú nếu phát hiện ở giai đoạn sớm tỉ lệ chữa khỏi đến 95%. Tuy nhiên tại Việt Nam,\n" +
"        vẫn có đến 50% bệnh nhân ung thư vú đến viện ở giai đoạn muộn.</p>\n" +
"    <p>Trong khi đó, việc tầm soát, sàng lọc có ý nghĩa vô cùng quan trọng với phát hiện sớm ung thư vú. Trong giai đoạn\n" +
"        2008-2010, qua sàng lọc 70.980 phụ nữ tại 7 tỉnh/thành phố, tỷ lệ phát hiện ung thư vú qua sàng lọc là\n" +
"        59,2/100.000 phụ nữ là khá cao, cho thấy hiệu quả khi triển khai các chương trình này tại cộng đồng.</p>\n" +
"    <p>Tuy nhiên tại cộng đồng, chỉ có 24,2% phụ nữ có thực hành tự khám vú hàng tháng trong số những người tham gia\n" +
"        chiến dịch sàng lọc, phát hiện sớm ung thư vú. Tuy nhiên, tín hiệu đáng mừng đó là tỷ lệ phát hiện bất thường ở\n" +
"        nhóm phụ nữ thực hành tự khám vú thấp hơn ở nhóm không thực hành cho thấy hiệu quả và ý nghĩa của việc hướng dẫn\n" +
"        phụ nữ tự khám vú đối với việc phát hiện sớm tổn thương ung thư vú.</p>\n" +
"    <p>\"Hiệu quả sàng lọc ung thư vú rất rõ, rất mong thời gian tới BHXH chi trả tối thiểu cho việc khám sàng lọc, qua\n" +
"        đó tăng được tỉ lệ người bệnh đi khám, điều trị sớm sẽ gia tăng tỉ lệ chữa khỏi, điều trị khỏi\", GS Thuấn\n" +
"        nói.</p>\n" +
"    <p style=\"text-align: right;\"><strong>Hồng Hải</strong></p>\n" +
"</div>";
        String result = text.replaceAll("<[^>]*>","");
        result = result.replaceAll("[\\t\\x0b\\r\\f]","");
        System.out.println(result);
    }
    
}
