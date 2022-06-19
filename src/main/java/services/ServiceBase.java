package services;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import utils.DBUtil;

/**
 * DB接続に関わる共通処理を行うクラス
 */
public class ServiceBase {

    /**
     * EntityManagerインスタンス
     */
    protected EntityManager em = DBUtil.createEntityManager();
    protected Session session = em.unwrap(org.hibernate.Session.class);
    protected SessionFactory factory = session.getSessionFactory();

    /**
     * EntityManagerのクローズ
     */
    public void close() {
        if (em.isOpen()) {
            em.close();
        }
    }
}