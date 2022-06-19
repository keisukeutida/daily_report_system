package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import constants.JpaConst;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 * フォローデータのDTOモデル
 *
 */

@Table(name = JpaConst.TABLE_FLW)
@NamedQueries({
    @NamedQuery(
            name = JpaConst.Q_FLW_GET_ALL_FLWEMP,
            query = JpaConst.Q_FLW_GET_ALL_FLWEMP_DEF),
    @NamedQuery(
            name = JpaConst.Q_FLW_TEST,
            query = JpaConst.Q_FLW_TEST_DEF
            )
})
@Getter //全てのクラスフィールドについてgetterを自動生成する(Lombok)
@Setter //全てのクラスフィールドについてsetterを自動生成する(Lombok)
@NoArgsConstructor //引数なしコンストラクタを自動生成する(Lombok)
@AllArgsConstructor //全てのクラスフィールドを引数にもつ引数ありコンストラクタを自動生成する(Lombok)
@Entity
public class Follow {
    /**
     * id
     */
    @Id
    @Column(name = JpaConst.FLW_COL_ID)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * フォローをした従業員
     */
    @ManyToOne
    @JoinColumn(name = JpaConst.FLW_COL_EMP, nullable = false)
    private Employee employee;

    /**
     * フォローされた従業員
     */

//    @ManyToOne
//    @JoinColumn(name = JpaConst.FLW_COL_FLWEMP, nullable = false)
//    private Employee followed_employee;


}
