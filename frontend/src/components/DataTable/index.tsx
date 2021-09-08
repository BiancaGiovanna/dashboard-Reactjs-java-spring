export default function DataTable() {
  return (
    <div className='table-responsive'>
      <table className='table table-striped table-sm'>
        <thead>
          <tr>
            <th>Data</th>
            <th>Vendedor</th>
            <th>Clientes visitados</th>
            <th>Vendas realizadas</th>
            <th>Valor</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>08/09/2021</td>
            <td>Jóse</td>
            <td>20</td>
            <td>10</td>
            <td>R$1500.00</td>
          </tr>
        </tbody>
      </table>
    </div>
  );
}
