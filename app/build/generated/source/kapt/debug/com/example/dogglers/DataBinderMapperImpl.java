package com.example.dogglers;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.dogglers.databinding.ActivityGridListBindingImpl;
import com.example.dogglers.databinding.ActivityHorizontalListBindingImpl;
import com.example.dogglers.databinding.ActivityMainBindingImpl;
import com.example.dogglers.databinding.ActivityVerticalListBindingImpl;
import com.example.dogglers.databinding.GridListItemBindingImpl;
import com.example.dogglers.databinding.VerticalHorizontalListItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYGRIDLIST = 1;

  private static final int LAYOUT_ACTIVITYHORIZONTALLIST = 2;

  private static final int LAYOUT_ACTIVITYMAIN = 3;

  private static final int LAYOUT_ACTIVITYVERTICALLIST = 4;

  private static final int LAYOUT_GRIDLISTITEM = 5;

  private static final int LAYOUT_VERTICALHORIZONTALLISTITEM = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.dogglers.R.layout.activity_grid_list, LAYOUT_ACTIVITYGRIDLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.dogglers.R.layout.activity_horizontal_list, LAYOUT_ACTIVITYHORIZONTALLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.dogglers.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.dogglers.R.layout.activity_vertical_list, LAYOUT_ACTIVITYVERTICALLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.dogglers.R.layout.grid_list_item, LAYOUT_GRIDLISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.dogglers.R.layout.vertical_horizontal_list_item, LAYOUT_VERTICALHORIZONTALLISTITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYGRIDLIST: {
          if ("layout/activity_grid_list_0".equals(tag)) {
            return new ActivityGridListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_grid_list is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYHORIZONTALLIST: {
          if ("layout/activity_horizontal_list_0".equals(tag)) {
            return new ActivityHorizontalListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_horizontal_list is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYVERTICALLIST: {
          if ("layout/activity_vertical_list_0".equals(tag)) {
            return new ActivityVerticalListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_vertical_list is invalid. Received: " + tag);
        }
        case  LAYOUT_GRIDLISTITEM: {
          if ("layout/grid_list_item_0".equals(tag)) {
            return new GridListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for grid_list_item is invalid. Received: " + tag);
        }
        case  LAYOUT_VERTICALHORIZONTALLISTITEM: {
          if ("layout/vertical_horizontal_list_item_0".equals(tag)) {
            return new VerticalHorizontalListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for vertical_horizontal_list_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/activity_grid_list_0", com.example.dogglers.R.layout.activity_grid_list);
      sKeys.put("layout/activity_horizontal_list_0", com.example.dogglers.R.layout.activity_horizontal_list);
      sKeys.put("layout/activity_main_0", com.example.dogglers.R.layout.activity_main);
      sKeys.put("layout/activity_vertical_list_0", com.example.dogglers.R.layout.activity_vertical_list);
      sKeys.put("layout/grid_list_item_0", com.example.dogglers.R.layout.grid_list_item);
      sKeys.put("layout/vertical_horizontal_list_item_0", com.example.dogglers.R.layout.vertical_horizontal_list_item);
    }
  }
}
