package actions.views;

import java.util.ArrayList;
import java.util.List;

import models.Follow;

/**
 * フォローデータのDTOモデル⇔Viewモデルの変換を行うクラス
 *
 */
public class FollowConverter {

    /**
     * ViewモデルのインスタンスからDTOモデルのインスタンスを作成する
     * @param rv ReportViewのインスタンス
     * @return Reportのインスタンス
     */
    public static Follow toModel(FollowView fl) {
        return new Follow(
                fl.getId(),
                EmployeeConverter.toModel(fl.getEmployee()),
                EmployeeConverter.toModel(fl.getFollowed_employee())
                );
    }

    /**
     * DTOモデルのインスタンスからViewモデルのインスタンスを作成する
     * @param f Followのインスタンス
     * @return FollowViewのインスタンス
     */
    public static FollowView toView(Follow f) {

        if (f == null) {
            return null;
        }

        return new FollowView(
                f.getId(),
                EmployeeConverter.toView(f.getEmployee()),
                EmployeeConverter.toView(f.getFollowed_employee())
                );
    }

    /**
     * DTOモデルのリストからViewモデルのリストを作成する
     * @param list DTOモデルのリスト
     * @return Viewモデルのリスト
     */
    public static List<FollowView> toViewList(List<Follow> list) {
        List<FollowView> evs = new ArrayList<>();

        for (Follow r : list) {
            evs.add(toView(r));
        }

        return evs;
    }


    /**
     * Viewモデルの全フィールドの内容をDTOモデルのフィールドにコピーする
     * @param f DTOモデル(コピー先)
     * @param fl Viewモデル(コピー元)
     */
    public static void copyViewToModel(Follow f, FollowView fl) {
        f.setId(fl.getId());
        f.setEmployee(EmployeeConverter.toModel(fl.getEmployee()));
        f.setFollowed_employee(EmployeeConverter.toModel(fl.getFollowed_employee()));


    }





}
