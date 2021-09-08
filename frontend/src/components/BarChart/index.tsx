import Chart from "react-apexcharts";

export default function BarChart() {
  const options = {
    plotOptions: {
      bar: {
        horizontal: false,
      },
    },
  };

  const mockData = {
    labels: {
      categories: ["José"],
    },
    series: [
      {
        name: "% Sucesso",
        data: [43.6],
      },
    ],
  };
  return (
    <Chart
      options={{ ...options, xaxis: mockData.labels }}
      series={mockData.series}
      type='bar'
      height='240'
    />
  );
}
