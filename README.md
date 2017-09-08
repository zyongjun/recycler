###### recycler
presenter+viewholder即可实现任意复杂的列表界面，mvp模式下简化multi item recyclerview的使用方式，只需要专注于presenter的编写


##### 添加到你的项目

Step 1. 添加JitPack源地址到build file
Add it in your root build.gradle at the end of repositories:

```java
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
   }
```

Step 2. 依赖包地址
```
dependencies {
	      compile 'com.github.zyongjun:recycler:v0.0.4'
	}
```

##### 如何使用
- **ViewHolder**: 继承 RecyclerViewHolder使用presenter泛型绑定你的item,item布局只需要使用注解直接声明即可
```
@HolderLayout(R.layout.item_bench_corp)  // layout of viewtype
public class WorkCorpHolder extends BindRecyclerHolder<WorkBenchPresenter>{
  @Override
    public void bindView(int position, WorkBenchPresenter presenter) {
      //bind your view with data from presenter
    }
}
```

- **presenter**:
继承 RecyclerPresenter 并复写以下两个方法
```
   public abstract int getItemViewType(int var1);

   public abstract int getItemCount();
```
or extends a BaseRecyclerPresenter include basic Mvp Presenter lifecycle method.

不需要实现Adapter只需要把presenter注入默认的RecyclerAdapter中 , presenter实现逻辑请参照上一步。
```
  mPresenter = new WorkBenchPresenter();
  mPresenter.attach(this);
  mAdapter = new RecyclerAdapter(mPresenter);
  mRvRecycler.setAdapter(mAdapter);
```
