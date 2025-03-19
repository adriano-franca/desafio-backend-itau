package desafio_itau_backend.spring_boot.dto;

import java.util.DoubleSummaryStatistics;

public class StatisticsResponse {

    public long count;
    public double sum;
    public double average;
    public double min;
    public double max;

    public StatisticsResponse(DoubleSummaryStatistics stats) {
        this.count = stats.getCount();
        this.sum = stats.getSum();
        this.average = stats.getAverage();
        this.min = stats.getMin();
        this.max = stats.getMax();
    }

    public long getCount() {
        return count;
    }

    public double getSum() {
        return sum;
    }

    public double getAverage() {
        return average;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }
}
