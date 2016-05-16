package me.urbanowicz.samuel.flowerminder.flowers;

import me.urbanowicz.samuel.flowerminder.data.Flower;

public class FlowersPresenter implements FlowersContract.Presenter {

    private FlowersContract.View flowersView;

    public FlowersPresenter(FlowersContract.View view) {
        this.flowersView = view;
        flowersView.setPresenter(this);
    }

    @Override
    public void loadTasks() {
        flowersView.displayNoFlowersInfo();
    }

    @Override
    public void confirmFlowerHanding(Flower flower) {

    }

    @Override
    public void start() {
        loadTasks();
    }
}