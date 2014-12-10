package jp.ac.shibaura_it.sayo.se.reservationsystem.user.model;

/**
 * Created by Shuya on 14/12/10.
 * 予約記録
 *
 * @author Shuya
 */
public class Reserve {
    /**
     * 使用責任者
     * 利用している人とは別に入力させる
     */
    private String responsiblePerson;

    /**
     * 使用責任者の連絡先
     * 予約詳細入力画面で電話番号を入力させる
     */
    private String responsiblePersonContact;

    /**
     * 使用人数
     */
    private Integer peopleNum;

    /**
     * 学事課がチェック済みかどうか
     */
    private Boolean isManagerCheck;

    /**
     * 予約の利用者
     */
    private User user;

    public void Reserve() {

    }

    /**
     * 予約記録を削除する
     * サーバと通信する
     * @return 削除が成功したかどうか
     */
    public Boolean delete() {
        return false;
    }

    /**
     * 予約記録をサーバに登録する
     * サーバと通信する
     * @return 登録が成功したかどうか
     */
    public Boolean regist() {
        return false;
    }

    /**
     * 予約記録をサーバに登録するために必要な情報が全て登録されているか判定する
     * @return 予約記録に不備がないかどうか
     */
    private Boolean isInputCheckError(){
        return false;
    }

    // Getter and Setter

    public String getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(String responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    public String getResponsiblePersonContact() {
        return responsiblePersonContact;
    }

    public void setResponsiblePersonContact(String responsiblePersonContact) {
        this.responsiblePersonContact = responsiblePersonContact;
    }

    public Integer getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(Integer peopleNum) {
        this.peopleNum = peopleNum;
    }

    public Boolean getIsManagerCheck() {
        return isManagerCheck;
    }

    public void setIsManagerCheck(Boolean isManagerCheck) {
        this.isManagerCheck = isManagerCheck;
    }
}
