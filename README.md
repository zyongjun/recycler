###### recycler
simple utils to recyclerview with presenter or not


##### Add it

Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:

```java
allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
```

Step 2. Add the dependency
```
dependencies {
	        compile 'com.github.zyongjun:recycler:v0.0.4'
	}
```

##### How to use
- simple RecyclerViewHolder
```
@HolderLayout(R.layout.item_bench_corp)  // layout of viewtype
public class WorkCorpHolder extends BindRecyclerHolder<WorkBenchPresenter>{
  @Override
    public void bindView(int position, WorkBenchPresenter presenter) {
      //bind your view with data from presenter
    }
}
```

- presenter
you can simple extends RecyclerPresenter with overide
```
   public abstract int getItemViewType(int var1);

   public abstract int getItemCount();
```
or extends a BaseRecyclerPresenter include basic Mvp Presenter lifecycle method.


you don't need to write an adapter , what you need to do is to implement you presenter
```
  mPresenter = new WorkBenchPresenter();
  mPresenter.attach(this);
  mAdapter = new RecyclerAdapter(mPresenter);
  mRvRecycler.setAdapter(mAdapter);
```
