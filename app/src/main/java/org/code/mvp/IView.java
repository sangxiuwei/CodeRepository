package org.code.mvp;

/**
 * View层接口
 */
public interface IView {

    void onProgressLoading(int progress);

    void setData(String data);
}
