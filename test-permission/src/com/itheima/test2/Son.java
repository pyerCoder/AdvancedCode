package com.itheima.test2;

import com.itheima.test1.Fu;

public class Son extends Fu {
/*    // 不同包下，被子类访问【无法访问，默认权限】
    public void method(){
        super.show();
    }
*/

    // 不同包下，被子类访问【可以访问，protected权限】
    public void method(){
        super.print();
    }

}
